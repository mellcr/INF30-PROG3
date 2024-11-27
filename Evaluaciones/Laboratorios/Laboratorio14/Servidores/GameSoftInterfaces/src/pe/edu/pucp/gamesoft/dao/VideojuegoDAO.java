package pe.edu.pucp.gamesoft.dao;

import java.util.ArrayList;
import pe.edu.pucp.gamesoft.model.Videojuego;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface VideojuegoDAO extends Remote{
    int insertar(Videojuego videojuego) throws RemoteException;
    ArrayList<Videojuego> listarPorNombre(String nombre) throws RemoteException;
    Videojuego obtenerPorId(int idVideojuego) throws RemoteException;
}