package pe.edu.pucp.softpub.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.util.Properties;
import static pe.edu.pucp.softpub.util.Cifrado.descifrarMD5;
//import java.util.logging.Logger; 

/*
 * DBManager GENERICO 
 * Author: mellcr
 */

public class DBManager {
    //archivo dnde almacenare los datos pra la conexion    | final = cte
    private static final String ARCHIVO_CONFIGURACION = "jdbc.properties"; 
    
    private Connection conexion; 
    private String driver;
    private String tipo_de_driver;
    private String base_de_datos;
    private String nombre_de_host;
    private String puerto;
    private String usuario;
    private String contraseña; 
    private static DBManager dbManager = null; 
    
    private DBManager(){}; //constructor privado para que no se pueda instanciar
    
    // a traves de este metodo se crea el DBManager
    public static DBManager getInstance(){
        if(DBManager.dbManager==null){
            createInstance(); //deja de ser nulo 
        }
        return DBManager.dbManager; 
    }
    
    private static void createInstance(){
        if(DBManager.dbManager==null)
            DBManager.dbManager = new DBManager();
    }
    
    public Connection getConnection(){        
        try {
            leer_archivo_de_propiedades();
            Class.forName(this.driver);
            this.conexion = DriverManager.getConnection(getURL(), this.usuario, descifrarMD5(this.contraseña));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {        
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.conexion;
    }
    
    //funciona independientemente del tipo de driver 
    private String getURL(){
        String url = this.tipo_de_driver.concat("://");
        url = url.concat(this.nombre_de_host);
        url = url.concat(":");
        url = url.concat(this.puerto);
        url = url.concat("/");
        url = url.concat(this.base_de_datos);
        System.out.println(url);
        return url;
    }
    
    private void leer_archivo_de_propiedades(){
        Properties properties = new Properties();
        String nmArchivoConf = "resources/" + ARCHIVO_CONFIGURACION;
        try {
            properties.load(new FileInputStream(new File(nmArchivoConf)));
            this.driver = properties.getProperty("driver");
            this.tipo_de_driver = properties.getProperty("tipo_de_driver");
            this.base_de_datos = properties.getProperty("base_de_datos");
            this.nombre_de_host = properties.getProperty("nombre_de_host");
            this.puerto = properties.getProperty("puerto");
            this.usuario = properties.getProperty("usuario");
            this.contraseña = properties.getProperty("contrasenha");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DBManager.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}





//NOTA:
//no tienen metodos selectores -> no quiero exponer sus atributos fuera de la clase 