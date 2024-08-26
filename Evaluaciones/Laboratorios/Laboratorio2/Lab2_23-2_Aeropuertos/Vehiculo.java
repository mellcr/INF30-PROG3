
public abstract class Vehiculo implements Consultable{
	protected String modelo; 
	protected Double velocidadMax; 
	protected Aerolinea aerolinea; 
	
	//constructor 
	public Vehiculo(Aerolinea aerolinea, String modelo, Double velocidadMax){
		this.aerolinea= aerolinea; 
		this.modelo = modelo;
		this.velocidadMax = velocidadMax;
	}
	
	//getters y setters
	
	
	
}