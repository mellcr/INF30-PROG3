package pe.edu.pucp.gamesoft.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.Calendar;
import pe.edu.pe.pucp.gamesoft.mysql.GeneroMySQL;
import pe.edu.pe.pucp.gamesoft.mysql.VideojuegoMySQL;
import pe.edu.pucp.gamesoft.config.DBManager;
import pe.edu.pucp.gamesoft.dao.GeneroDAO;
import pe.edu.pucp.gamesoft.dao.VideojuegoDAO;
import pe.edu.pucp.gamesoft.model.Clasificacion;
import pe.edu.pucp.gamesoft.model.Genero;
import pe.edu.pucp.gamesoft.model.Videojuego;

public class Principal {
    /* Colocar sus datos personales
    * ------------------------------------------------
    * Nombre Completo: MELL ALESSANDRA CARBAJAL ROMAN 
    * Codigo PUCP: 20214987
    * ------------------------------------------------
    */
    private static String IPServidor = "127.0.0.1";
    private static String puertoServicio = "1234";
    
    public static void main(String[] args) throws RemoteException {
        try{
            //Registramos el servicio de RMI
            LocateRegistry.createRegistry(Integer.parseInt(puertoServicio));
            
            //Inicializamos los objetos remotos
            GeneroDAO daoGenero = new GeneroMySQL(Integer.parseInt(puertoServicio)); 
            VideojuegoDAO daoVideojuego = new VideojuegoMySQL(Integer.parseInt(puertoServicio)); 

            
            //Colocamos los objetos en el servicio RMI
            Naming.rebind("//"+IPServidor+":"+String.valueOf(puertoServicio)+"/daoGenero", daoGenero);
            Naming.rebind("//"+IPServidor+":"+String.valueOf(puertoServicio)+"/daoVideojuego", daoVideojuego);
            
            //Imprimimos mensaje de confirmación
            System.out.println("El servidor RMI se ha inicializado correctamente..");
//            
//            // **Probar el método listarTodos**
//            ArrayList<Genero> generos = daoGenero.listarTodos();
//
//            // Validar si hay resultados
//            if (generos.isEmpty()) {
//                System.out.println("No se encontraron géneros.");
//            } else {
//                for (Genero genero : generos) {
//                    System.out.println("Nombre: " + genero.getNombre());
//                }
//            }  
            
//            // Crear un objeto Videojuego para probar la inserción
//            Videojuego videojuego = new Videojuego();
//            videojuego.setNombre("The Witcher 3");
//            videojuego.setFoto(new byte[] { 1, 2, 3, 4, 5 }); // Simulando una foto con datos binarios
//            videojuego.setCostoDesarrollo(5000000.0); // Costo de desarrollo en millones
//            videojuego.setFechaLanzamiento(Calendar.getInstance().getTime());
//            Genero genero = new Genero();
//            genero.setIdGenero(1);  // Asumiendo que "1" es un id válido
//            videojuego.setGenero(genero);
//            videojuego.setClasificacion(Clasificacion.TEEN);
//            // Probar la inserción de Videojuego
//            int idInsertado = daoVideojuego.insertar(videojuego);
//            System.out.println("Videojuego insertado con ID: " + idInsertado);
            
            
        }catch(MalformedURLException | RemoteException ex){
            System.out.println("Error inicializando el RMI: " + ex.getMessage());
        }
    }
}
    