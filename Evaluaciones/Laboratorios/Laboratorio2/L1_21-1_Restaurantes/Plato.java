

public class Plato extends ItemVenta{
	private String nombre; 
	
	//constructor
	public Plato(Integer id, String nombre,Double precio){
		super(id,precio);
		this.nombre = nombre; 
	}
	
	public String consultarDatos(){
		return nombre + " " + " - S/." + precio.toString(); 
	}
	
	
}