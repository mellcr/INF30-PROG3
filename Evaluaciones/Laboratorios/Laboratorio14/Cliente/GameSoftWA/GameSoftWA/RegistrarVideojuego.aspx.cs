using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data.SqlClient;
using System.EnterpriseServices;
using System.IO;
using System.Linq;
using System.Web;
using System.Web.Services.Description;
using System.Web.UI;
using System.Web.UI.WebControls;
using GameSoftBO;
using GameSoftBO.ServicioWS;

namespace GameSoftWA
{
    /* Colocar sus datos personales
     * ------------------------------------------------
     * Nombre Completo:
     * Codigo PUCP:
     * ------------------------------------------------
     */

    public partial class RegistrarVideojuego : System.Web.UI.Page
    {
        private GeneroBO generoBO;
        private VideojuegoBO videojuegoBO;

        public RegistrarVideojuego()
        {
            generoBO = new GeneroBO();
            videojuegoBO = new VideojuegoBO();
        }
        protected void Page_Load(object sender, EventArgs e)
        {
            ddlGenero.DataSource = generoBO.listarTodos();
            ddlGenero.DataTextField = "nombre";
            ddlGenero.DataValueField = "idGenero";
            ddlGenero.DataBind();

            String accion = Request.QueryString["accion"];
            String idVideojuego = Request.QueryString["idVideojuego"];
            if (accion != null && accion == "ver" && idVideojuego != null)
            {
                lblTitulo.Text = "Visualizar Videojuego";
                //Completar
                deshabilitarCampos();
            }
            else
                lblTitulo.Text = "Registrar Videojuego";
            if (IsPostBack && fileUploadFotoVideojuego.PostedFile != null && fileUploadFotoVideojuego.HasFile)
            {
                string extension = System.IO.Path.GetExtension(fileUploadFotoVideojuego.FileName);
                if (extension.ToLower() == ".jpg" || extension.ToLower() == ".jpeg" || extension.ToLower() == ".png" || extension.ToLower() == ".gif")
                {
                    string filename = Guid.NewGuid().ToString() + extension;
                    string filePath = Server.MapPath("~/Uploads/") + filename;
                    fileUploadFotoVideojuego.SaveAs(Server.MapPath("~/Uploads/") + filename);
                    imgFotoVideojuego.ImageUrl = "~/Uploads/" + filename;
                    imgFotoVideojuego.Visible = true;
                    FileStream fs = new FileStream(filePath, FileMode.Open, FileAccess.Read);
                    BinaryReader br = new BinaryReader(fs);
                    Session["foto"] = br.ReadBytes((int)fs.Length);
                    fs.Close();
                }
                else
                {
                    Response.Write("Por favor, selecciona un archivo de imagen válido.");
                }
            }
        }

        protected void btnRegresar_Click(object sender, EventArgs e)
        {
            Response.Redirect("ListarVideojuegos.aspx");
        }

        public void deshabilitarCampos()
        {
            txtNombre.Enabled = false;
            ddlGenero.Enabled = false;
            dtpFechaLanzamiento.Disabled = true;
            txtCostoDesarrollo.Enabled = false;
            fileUploadFotoVideojuego.Enabled = false;
            rbEveryone.Disabled = true;
            rbTeen.Disabled = true;
            rbMature.Disabled = true;
            rbAdultsOnly.Disabled = true;
            btnGuardar.Visible = false;
        }

        protected void btnGuardar_Click(object sender, EventArgs e)
        {
            // Obtener los valores de los controles de la página
            int fid_genero = Int32.Parse(ddlGenero.SelectedValue);  // ID del género
            string nombre = txtNombre.Text;  // Nombre del videojuego
            DateTime fecha_lanzamiento = DateTime.Parse(dtpFechaLanzamiento.Value);  // Fecha de lanzamiento
            double costo_desarrollo = Double.Parse(txtCostoDesarrollo.Text);  // Costo de desarrollo
            byte[] foto = (byte[])Session["foto"];  // Foto (se asume que la imagen está guardada en la sesión)

            // Asignar la clasificación según la opción seleccionada
            clasificacion clasificacion = GameSoftBO.ServicioWS.clasificacion.EVERYONE;  // Valor por defecto
            if (rbTeen.Checked) clasificacion = GameSoftBO.ServicioWS.clasificacion.TEEN;
            else if (rbMature.Checked) clasificacion = GameSoftBO.ServicioWS.clasificacion.MATURE;
            else if (rbAdultsOnly.Checked) clasificacion = GameSoftBO.ServicioWS.clasificacion.ADULTSONLY;

            // Llamar al método insertar
            int resultado = videojuegoBO.insertar(fid_genero, nombre, fecha_lanzamiento, costo_desarrollo, foto, clasificacion);

            // Verificar el resultado y redirigir
            if (resultado > 0)  // Si el resultado es mayor que 0, el videojuego fue insertado correctamente
            {
                Response.Redirect("ListarVideojuegos.aspx");
            }
            else
            {
                // Si ocurrió algún problema al insertar, mostrar un mensaje de error
                //lblError.Text = "Hubo un problema al guardar el videojuego.";
            }
        }

    }
}