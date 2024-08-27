
public class Bebida extends ItemVenta{
	private String marca; 
	private Double capacidad; 
	private String unidadMed; 
	
	//constructor
	public Bebida(Integer id, String marca,Double capacidad,
			String unidadMed,Double precio){
		super(id,precio);
		this.marca = marca; 
		this.capacidad = capacidad; 
		this.unidadMed = unidadMed; 
	}
	
	
	public String consultarDatos(){
		return marca + " " + capacidad.toString() +unidadMed+ " - S/." + precio.toString(); 
	}
	
	
}