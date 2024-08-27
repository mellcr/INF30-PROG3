
public class Local{
	private String nombre;
	private String direccion;
	private Integer aforo;
	
	public Local(String nombre, String direccion, Integer aforo){
		this.nombre = nombre;
		this.direccion = direccion;
		this.aforo = aforo;
		
	}
	
	public String getNombre(){
		return nombre; 
	}
	
}