
public abstract class Persona implements IConsultable{
	protected String DNI; 
	protected String nombre; 
	protected String paterno; 
	protected String materno; 
	
	public Persona(String DNI, String nombre, String paterno, String materno){
		this.DNI = DNI; 
		this.nombre = nombre; 
		this.paterno= paterno; 
		this.materno= materno; 
	}
	
	
	
}