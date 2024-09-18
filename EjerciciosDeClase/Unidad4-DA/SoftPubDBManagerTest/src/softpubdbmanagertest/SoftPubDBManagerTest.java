package softpubdbmanagertest;

import java.sql.Connection;
import pe.edu.pucp.softpub.config.DBManager;
import pe.edu.pucp.softpub.util.Cifrado;

public class SoftPubDBManagerTest {
    public static void main(String[] args) {
        // TODO code application logic here
        DBManager dbManager = null;
        System.out.println(dbManager);
        dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        
        //String contraseñaCifrada = Cifrado.cifrarMD5("shabita17");
        //System.out.println(contraseñaCifrada);
        
        Connection conexion = dbManager.getConnection(); //hace la conexion
    }

}
