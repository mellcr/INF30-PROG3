using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GameSoftBO.ServicioWS;

namespace GameSoftBO
{
    public class GeneroBO: BaseBO
    {
        public BindingList<genero> listarTodos()
        {
            genero[] arreglo = WsGenero.listarTodosGeneros();
            if (arreglo == null)
            {
                return null;
            }
            return new BindingList<genero>(arreglo);
        }
    }
}
