

public abstract class ProgramaAcademico implements IConsultable{
	private static Integer indice=1; //identificador num CORRELATIVO, compartido por todas sus instancias
	protected Integer idProgramaAcademico;
	protected String nombre;
	protected String clave;
	protected char modalidad;
	protected double precio;
	
	//constructor por parametros de una clase abstacta -> lo usaran sus hijos
	public ProgramaAcademico(String nombre, String clave, char modalidad,
							double precio){
		this.idProgramaAcademico = indice;
		this.nombre= nombre;
		this.clave= clave;
		this.modalidad= modalidad;
		this.precio= precio;
		
		//aumentamos el indice :) - correlativo
		indice++;
	}
	
	//public abstract String consultarDatos();    -> similar a un metodo virtual en C++
	
}