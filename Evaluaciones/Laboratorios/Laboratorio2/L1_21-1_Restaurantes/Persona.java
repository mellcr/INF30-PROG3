

public abstract class Persona implements IConsulta{
	protected Integer id; 
	protected String nombre; 
	protected String apellido; 
	protected String DNI; 
	
	public Persona(Integer id, String nombre, String apellido, String DNI){
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.DNI = DNI;
	}
	
	
}