
public class Remolque extends Vehiculo{
	private Double capacidadMaxTrans; 
	
	//constructor 
	public Remolque(Aerolinea aerolinea,String modelo, Double velocidadMax,
				Double capacidadMaxTrans){
		super(aerolinea,modelo,velocidadMax);
		this.capacidadMaxTrans = capacidadMaxTrans;
	}
	
	//getters y setters
	public String consultarDatos(){
		return "REMOLQUE: "+modelo + " - Capacidad Carga: " + capacidadMaxTrans + " kg.\n";
	}
	
	
}