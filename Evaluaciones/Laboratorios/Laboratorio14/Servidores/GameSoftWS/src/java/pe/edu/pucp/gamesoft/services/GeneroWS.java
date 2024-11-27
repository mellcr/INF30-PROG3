package pe.edu.pucp.gamesoft.services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import java.net.MalformedURLException;
import java.util.ArrayList;
import pe.edu.pucp.gamesoft.dao.GeneroDAO;
import pe.edu.pucp.gamesoft.model.Genero;
//LIBERIA RMI
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;

/* Colocar sus datos personales
* ------------------------------------------------
* Nombre Completo:
* Codigo PUCP:
* ------------------------------------------------
*/

@WebService(serviceName = "GeneroWS", targetNamespace = "services.gamesoft.pucp.edu.pe")
public class GeneroWS {
    
    private GeneroDAO daoGenero;
    
    @WebMethod(operationName = "listarTodosGeneros")
    public ArrayList<Genero> listarTodosGeneros() {
        ArrayList<Genero> generos = null;
        try{
            daoGenero = (GeneroDAO) Naming.lookup("//127.0.0.1:1234/daoGenero");
            generos = daoGenero.listarTodos();
        }catch(MalformedURLException | NotBoundException | RemoteException ex){
            System.out.println(ex.getMessage());
        }
        return generos;
    }
    
}






