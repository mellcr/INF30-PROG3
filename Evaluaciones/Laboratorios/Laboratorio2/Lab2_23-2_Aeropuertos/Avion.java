public class Avion extends Vehiculo{
	private Integer capacidadMaxPasaj; 
	
	//constructor 
	public Avion(Aerolinea aerolinea,String modelo,Double velocidadMax,
				Integer capacidadMaxPasaj){
		super(aerolinea,modelo,velocidadMax);
		this.capacidadMaxPasaj = capacidadMaxPasaj;
	}
	
	//getters y setters
	
	
	public String consultarDatos(){
		return "AVION: " +modelo + "Capacidad Max. Pasajeros: "+ capacidadMaxPasaj 
			+ aerolinea.imprimeDatos();
	}
	
	
	
}