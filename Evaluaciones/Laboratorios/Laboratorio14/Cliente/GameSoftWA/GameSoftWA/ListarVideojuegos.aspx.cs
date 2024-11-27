using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace GameSoftWA
{
    /* Colocar los datos personales
     * ------------------------------------------------
     * Nombre Completo:
     * Codigo PUCP:
     * ------------------------------------------------
     */
    public partial class ListarVideojuegos : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void lbRegistrar_Click(object sender, EventArgs e)
        {
            Response.Redirect("RegistrarVideojuego.aspx");
        }

        protected void lbVisualizar_Click(object sender, EventArgs e)
        {
            int idVideojuego = Int32.Parse(((LinkButton)sender).CommandArgument);
            Response.Redirect("RegistrarVideojuego.aspx?accion=ver&idVideojuego=" + idVideojuego.ToString());
        }
    }
}