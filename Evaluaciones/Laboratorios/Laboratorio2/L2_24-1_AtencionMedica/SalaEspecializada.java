
public class SalaEspecializada extends AmbienteClinico{
	private String nombre;
	private Boolean poseeImagenologia;
	
	public SalaEspecializada(Double metros, char torre, Integer piso, String nombre, Boolean poseeImagenologia){
		super(metros,torre,piso);
		this.nombre = nombre; 
		this.poseeImagenologia = poseeImagenologia; 
	}
	
	public String getNombre(){
		return nombre; 
	}
	
	
}