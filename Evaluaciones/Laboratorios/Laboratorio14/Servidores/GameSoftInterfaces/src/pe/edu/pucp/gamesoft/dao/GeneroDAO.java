package pe.edu.pucp.gamesoft.dao;
import java.util.ArrayList;
import pe.edu.pucp.gamesoft.model.Genero;
/*LIBRERIAS NECESARIAS*/
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GeneroDAO extends Remote {
    ArrayList<Genero> listarTodos() throws RemoteException;
    
}
