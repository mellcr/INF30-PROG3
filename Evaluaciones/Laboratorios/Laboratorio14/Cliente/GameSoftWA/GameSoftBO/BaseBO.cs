using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GameSoftBO.ServicioWS;

namespace GameSoftBO
{
    public class BaseBO
    {
        //                 nombreWS
        private ServicioWS.GeneroWSClient wsGenero;
        private ServicioWS.VideojuegoWSClient wsVideojuego;
        public BaseBO()
        {
            this.WsGenero = new  ServicioWS.GeneroWSClient();
            this.WsVideojuego = new ServicioWS.VideojuegoWSClient();

        }

        public GeneroWSClient WsGenero { get => wsGenero; set => wsGenero = value; }
        public VideojuegoWSClient WsVideojuego { get => wsVideojuego; set => wsVideojuego = value; }
    }
}
