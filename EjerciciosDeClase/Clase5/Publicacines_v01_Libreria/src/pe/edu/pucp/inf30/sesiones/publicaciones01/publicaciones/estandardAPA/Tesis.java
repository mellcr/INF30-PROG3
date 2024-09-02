

package pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.estandardAPA;
import pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.Clase_de_Tesis;
import pe.edu.pucp.inf30.sesiones.publicaciones01.publicaciones.Publicacion;

/**
 * 
 * 
 */
public class Tesis extends Publicacion{
    private Clase_de_Tesis clase;
    private String departamento;
    private String institucion;
    private String ciudad;
    private String estado;

    public Tesis(String nombre, String nombre_completo_autor, Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado) {
        super(nombre, nombre_completo_autor, año);
        this.clase = clase;
        this.departamento = departamento;
        this.institucion = institucion;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    public Tesis(String nombre, String nombres_completos_autores[], Integer año, Clase_de_Tesis clase, String departamento, String institucion, String ciudad, String estado) {
        super(nombre, nombres_completos_autores, año);
        this.clase = clase;
        this.departamento = departamento;
        this.institucion = institucion;
        this.ciudad = ciudad;
        this.estado = estado;
    }

    @Override
    public void referenciar() {
        
    }
}
