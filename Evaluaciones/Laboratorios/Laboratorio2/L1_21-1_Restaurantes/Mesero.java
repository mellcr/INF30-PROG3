
public class Mesero extends Persona{
	private Double sueldo; 
	
	public Mesero(Integer id, String nombre, String apellido, String DNI,
					Double sueldo){
		super(id,nombre,apellido,DNI); 
		this.sueldo = sueldo;
	}
	
	public String consultarDatos(){
		return "Mesero: "+id + " - " + nombre +" " + apellido  + "\n"; 
	}
	
}