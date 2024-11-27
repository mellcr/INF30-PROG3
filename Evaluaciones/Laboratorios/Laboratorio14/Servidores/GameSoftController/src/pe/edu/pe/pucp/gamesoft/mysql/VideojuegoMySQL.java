package pe.edu.pe.pucp.gamesoft.mysql;

import java.util.ArrayList;
import pe.edu.pucp.gamesoft.dao.VideojuegoDAO;
import pe.edu.pucp.gamesoft.model.Videojuego;
/*LIBRERIAS*/
import java.sql.Connection;
import java.rmi.RemoteException;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.ResultSet; 
import java.rmi.server.UnicastRemoteObject;
import java.sql.Date;
import pe.edu.pucp.gamesoft.config.DBManager;
/*
 * @author mell1
 */

public class VideojuegoMySQL extends UnicastRemoteObject implements VideojuegoDAO{
    
    private Connection con;
    private CallableStatement cs;
    private ResultSet rs;
    
    
    public VideojuegoMySQL(int puerto) throws RemoteException{
        super(puerto);
    }

    @Override
    public int insertar(Videojuego videojuego) throws RemoteException {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            cs = con.prepareCall("{call INSERTAR_VIDEOJUEGO(?,?,?,?,?,?,?)}");
            cs.registerOutParameter("_id_videojuego", java.sql.Types.INTEGER);
            cs.setInt("_fid_genero", videojuego.getGenero().getIdGenero());
            cs.setString("_nombre", videojuego.getNombre());
            cs.setDate("_fecha_lanzamiento", new java.sql.Date(videojuego.getFechaLanzamiento().getTime()));
            cs.setDouble("_costo_desarrollo", videojuego.getCostoDesarrollo());
            cs.setBytes("_foto", videojuego.getFoto());
            cs.setString("_clasificacion", String.valueOf(videojuego.getClasificacion()));   
            
            cs.executeUpdate();
            videojuego.setIdVideojuego(cs.getInt("_id_videojuego"));
            resultado = videojuego.getIdVideojuego();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();}catch(SQLException ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }

    @Override
    public ArrayList<Videojuego> listarPorNombre(String nombre) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Videojuego obtenerPorId(int idVideojuego) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
