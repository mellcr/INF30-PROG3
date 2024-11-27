package pe.edu.pucp.gamesoft.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import pe.edu.pucp.gamesoft.dao.VideojuegoDAO;
import pe.edu.pucp.gamesoft.model.Videojuego;

/* Colocar sus datos personales
* ------------------------------------------------
* Nombre Completo:
* Codigo PUCP:
* ------------------------------------------------
*/

@WebService(serviceName = "VideojuegoWS", targetNamespace = "services.gamesoft.pucp.edu.pe")
public class VideojuegoWS {

    private VideojuegoDAO daoVideojuego;
    
    @WebMethod(operationName = "insertarVideojuego")
    public int insertarOrdenVenta (@WebParam(name = "ordenVenta") Videojuego videojuego) {
        int resultado = 0;
        try{
            daoVideojuego = (VideojuegoDAO) Naming.lookup("//127.0.0.1:1234/daoVideojuego");
            resultado = daoVideojuego.insertar(videojuego);
        }catch(MalformedURLException | NotBoundException | RemoteException ex){
            System.out.println(ex.getMessage());
        }
        return resultado;
    }
    
    
}