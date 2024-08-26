import java.util.ArrayList; // Sede (1,n) ProgAcad

public class Sede{
	private Integer idSede;
	private String nombre;
	private String direccion;
	private ArrayList <ProgramaAcademico> programasAcad;
	
	////////////////////////// constructor por parametros //////////////////////////////
	public Sede(Integer idSede, String nombre, String direccion){
		this.idSede = idSede;
		this.nombre= nombre;
		this.direccion= direccion;
	}
	////////////////////////// metodos selectores //////////////////////////////
	public String getNombre(){
		return nombre;
	}
	
	/////////////////////////// metodos :) ///////////////////////////////
	public void setProgramasAcademicos(ArrayList<ProgramaAcademico> programasAcad){
		this.programasAcad = programasAcad;
		//metodo que guarda espacio de memeria al arraylist 
		// en el main: sede1.setProgramasAcademicos(new ArrayList<>());
	}
	
	public ArrayList<ProgramaAcademico> getProgramasAcademicos(){
		return programasAcad;
	}
	
	public String consultarProgramas(){
		String cadena = ""; //inicializacion
		//para cada programasAcad consultamos los datos usando la interfaz 
		for(ProgramaAcademico pa: programasAcad){
			cadena += pa.consultarDatos() + "\n";
		}
		return cadena; //devuelve datos de TODOS los programas academicos 
	}
	
}