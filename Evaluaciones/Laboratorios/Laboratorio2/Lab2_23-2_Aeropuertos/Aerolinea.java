
public class Aerolinea extends Empresa{
	private String nombreAerolinea; 
	private Boolean callSign; 
	
	//constructor 
	public Aerolinea(String nombre, String nombreAerolinea, Boolean callSign){
		super(nombre); 
		this.nombreAerolinea = nombreAerolinea; 
		this.callSign = callSign; 
	}
	
	//getters y setters
	public String imprimeDatos(){
		return "Aerolinea: " + nombreAerolinea + " - " + nombre + " - Programa Fidelidad: " + callSign.toString() + "\n";
	}
	
	 
}