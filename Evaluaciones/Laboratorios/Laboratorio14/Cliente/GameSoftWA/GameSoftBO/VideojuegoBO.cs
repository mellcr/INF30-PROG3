using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http.Headers;
using System.Text;
using System.Threading.Tasks;
using GameSoftBO.ServicioWS;

namespace GameSoftBO
{
    public class VideojuegoBO: BaseBO
    {
        public int insertar(int fid_genero, string nombre, DateTime fecha_lanzamiento, double costo_desarrollo,
            byte[] foto, clasificacion clasificacion)
        {
            videojuego vidJuego = new videojuego();
            vidJuego.genero = new genero();
            vidJuego.genero.idGenero = fid_genero;
            vidJuego.nombre = nombre;
            vidJuego.fechaLanzamiento = fecha_lanzamiento;
            vidJuego.fechaLanzamientoSpecified = true;
            vidJuego.costoDesarrollo = costo_desarrollo;    
            vidJuego.clasificacion = clasificacion;
            vidJuego.clasificacionSpecified = true;
            vidJuego.foto = foto;

            return this.WsVideojuego.insertarVideojuego(vidJuego);
        }




    }
}
