
public class Cliente extends Persona{
	private Categoria categoria; 
	
	public Cliente(Integer id, String nombre, String apellido, String DNI,
					Categoria categoria){
		super(id,nombre,apellido,DNI); 
		this.categoria = categoria;
	}
	
	public String consultarDatos(){
		return "Cliente: "+id + " - " + nombre +" " + apellido  + " - " + categoria +"\n"; 
	}
	
	
	
	
}