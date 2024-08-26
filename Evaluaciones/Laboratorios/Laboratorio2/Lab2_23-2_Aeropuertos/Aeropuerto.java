
public class Aeropuerto implements Consultable {
	private String nombre; 
	private String direccion; 
	private TipoAeropuerto tipoAeropuerto; 
	private Ciudad ciudad; 
	private Operadora operadora; 
	
	//constructor 
	public Aeropuerto(String nombre, String direccion, TipoAeropuerto tipoAeropuerto,
						Ciudad ciudad, Operadora operadora){
		this.nombre = nombre;
		this.direccion = direccion;
		this.tipoAeropuerto = tipoAeropuerto;
		this.ciudad = ciudad;
		this.operadora = operadora;
	}
	
	//getters y setters
	
	
	public String consultarDatos(){
		return "Aeropuerto: " +nombre + " - "+ciudad.getNombre() + tipoAeropuerto+"\n"+
			operadora.toString(); 
	}
	
	
	
}