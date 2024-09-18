package com.medicalsoft.infraestructura.mysql;
import com.medicalsoft.config.DBManager;
import com.medicalsoft.infraestructura.dao.SalaEspecializadaDAO;
import com.medicalsoft.infraestructura.model.SalaEspecializada;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.util.ArrayList;

/*
 Similar al DAOImpl (Melgar)
*/

public class SalaEspecializadaMySQL implements SalaEspecializadaDAO{
    private PreparedStatement pst; //sentencia SQL precompilada -> para ej la inserción de datos
    private Statement st; 
    private Connection con; // representa la conex a bd
    private String sql;     // cadena de la consulta sql
    private ResultSet rs; 
    
    
    @Override
    public int insertar(SalaEspecializada salaEspecializada) {
        int resultado = 0;
        try{
            //CREA LA conexion de bd
            con = DBManager.getInstance().getConnection();
            //sentencia sql 
            sql = "INSERT INTO sala_especializada(nombre,espacio_en_m2,torre"
                    + ",piso,posee_equipamiento_imagenologia,activa) "
                    + "VALUES(?,?,?,?,?,1)"; // 
            //prepara el statement
            pst = con.prepareStatement(sql);
            //llena los valores que fueron puestos como ? 
            pst.setString(1, salaEspecializada.getNombre());
            pst.setDouble(2, salaEspecializada.getEspacioEnMetrosCuadrados());
            pst.setString(3, String.valueOf(salaEspecializada.getTorre()));
            pst.setInt(4, salaEspecializada.getPiso());
            pst.setBoolean(5, salaEspecializada.isPoseeEquipamientoImagenologia());
            resultado = pst.executeUpdate();
        }catch(Exception ex){
            //impresion de mensj asociado a la excepción 
            System.out.println(ex.getMessage());
        } //desp del try-catch se ejecuta el finally -> siempre se cierra la conex
        finally{
            try{
                con.close();
            }catch(Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
        return resultado;
    }
    // si se devuelve 0 es pq no se ha ejecutado 
    //retorna el id que genera la base de datos -> resultado 
    
    
    @Override
    public int modificar(SalaEspecializada salaEspecializada) {
        int resultado = 0;
        try {
            // Obtener la conexión a la base de datos
            con = DBManager.getInstance().getConnection();

            // Consulta SQL para actualizar la tabla sala_especializada
            String sql = "UPDATE sala_especializada SET nombre = ?, espacio_en_m2 = ?, torre = ?, "
                    + "piso = ?, posee_equipamiento_imagenologia = ?, activa = ? WHERE id_sala_especializada = ?";

            // Usar PreparedStatement para evitar inyección SQL
            PreparedStatement pst = con.prepareStatement(sql);

            // Asignar los valores a los parámetros
            pst.setString(1, salaEspecializada.getNombre());  // Nombre de la sala
            pst.setDouble(2, salaEspecializada.getEspacioEnMetrosCuadrados());  // Espacio en m2
            pst.setString(3, String.valueOf(salaEspecializada.getTorre()));  // Torre (asumimos que es un char o string)
            pst.setInt(4, salaEspecializada.getPiso());  // Piso
            pst.setBoolean(5, salaEspecializada.isPoseeEquipamientoImagenologia());  // Equipamiento de imagenología
            pst.setBoolean(6, true);  // Estado activa
            pst.setInt(7, salaEspecializada.getIdAmbienteClinico());  // ID de la sala

            // Ejecutar la consulta de actualización
            resultado = pst.executeUpdate();

        } catch (Exception ex) {
            // Manejo de errores
            System.out.println(ex.getMessage());
        } finally {
            try {
                // Cerrar la conexión a la base de datos
                con.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }

        // Devolver el resultado (número de filas afectadas)
        return resultado;
    }
    
    
    @Override
    public int eliminar(SalaEspecializada salaEspecializada) {
        int resultado = 0;
        try{
            con = DBManager.getInstance().getConnection();
            String sql = "UPDATE area SET activa = 0 WHERE id_area = " + salaEspecializada.hashCode();
            st = con.createStatement();
            resultado = st.executeUpdate(sql);
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }finally{
            try{con.close();} catch(SQLException ex){System.out.println(ex.getMessage());}
        }
        return resultado;
    }
    
    
    @Override
    public ArrayList<SalaEspecializada> listarTodas() {
        ArrayList<SalaEspecializada> salasEspecializadas = new ArrayList<>();
        try {
            // Obtener la conexión a la base de datos
            con = DBManager.getInstance().getConnection();

            // Consulta SQL para obtener todas las salas activas
            String sql = "SELECT id_sala_especializada, nombre, espacio_en_m2, torre, piso, "
                       + "posee_equipamiento_imagenologia, activa FROM sala_especializada WHERE activa = 1";

            // Usar Statement para ejecutar la consulta
            st = con.createStatement();
            rs = st.executeQuery(sql);

            // Recorrer los resultados y agregar las salas a la lista
            while (rs.next()) {
                SalaEspecializada salaEspecializada = new SalaEspecializada();
                salaEspecializada.setIdSalaEspecializada(rs.getInt("id_sala_especializada"));
                salaEspecializada.setNombre(rs.getString("nombre"));
                salaEspecializada.setEspacioEnMetrosCuadrados(rs.getDouble("espacio_en_m2"));
                salaEspecializada.setTorre(rs.getString("torre").charAt(0));
                salaEspecializada.setPiso(rs.getInt("piso"));
                salaEspecializada.setPoseeEquipamientoImagenologia(rs.getBoolean("posee_equipamiento_imagenologia"));
                salaEspecializada.setActiva(rs.getBoolean("activa"));

                // Agregar la sala a la lista
                salasEspecializadas.add(salaEspecializada);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                // Cerrar la conexión a la base de datos
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

        return salasEspecializadas;
    }
    
    
    @Override
public SalaEspecializada obtenerPorId(int idSalaEspecializada) {
    SalaEspecializada salaEspecializada = new SalaEspecializada();
    try {
        // Obtener la conexión a la base de datos
        con = DBManager.getInstance().getConnection();

        // Construir la consulta SQL utilizando el ID directamente en la cadena
        String sql = "SELECT id_sala_especializada, nombre, espacio_en_m2, torre, piso, "
                   + "posee_equipamiento_imagenologia, activa FROM sala_especializada WHERE id_sala_especializada = " + idSalaEspecializada;

        // Crear y ejecutar la consulta con Statement
        st = con.createStatement();
        rs = st.executeQuery(sql);

        // Asignar los resultados al objeto SalaEspecializada
        if (rs.next()) {
            salaEspecializada.setIdSalaEspecializada(rs.getInt("id_sala_especializada"));
            salaEspecializada.setNombre(rs.getString("nombre"));
            salaEspecializada.setEspacioEnMetrosCuadrados(rs.getDouble("espacio_en_m2"));
            salaEspecializada.setTorre(rs.getString("torre").charAt(0));
            salaEspecializada.setPiso(rs.getInt("piso"));
            salaEspecializada.setPoseeEquipamientoImagenologia(rs.getBoolean("posee_equipamiento_imagenologia"));
            salaEspecializada.setActiva(rs.getBoolean("activa"));
        }
    } catch (SQLException ex) {
        System.out.println(ex.getMessage());
    } finally {
        try {
            // Cerrar la conexión a la base de datos
            con.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    return salaEspecializada;
}




}

