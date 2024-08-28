import java.util.ArrayList;


public class Local implements InfoProvider{
	private String nombre; 
	private String direccion; 
	private Integer capacidad; 
	private TipoLocal tipoLocal; 


	
	// new Local("TEATRO CANOUT", "Av. Petit Thouars 4550 - Miraflores", 1000,TipoLocal.TEATRO);
	public Local(String nombre,String direccion,Integer capacidad,TipoLocal tipoLocal){
		this.nombre = nombre; 
		this.direccion = direccion; 
		this.capacidad = capacidad; 
		this.tipoLocal = tipoLocal; 
	}
	
	@Override
	public String devolverDatos(){
		return "LOCAL: " + nombre +  " - CAPACIDAD: "+ capacidad.toString()+"\n";
	}
	
	
	
}