import java.util.ArrayList; 

public class ObraTeatral extends Evento{
	private Integer cantTotalActos; 
	private Boolean obraInmersiva; 
	

	public ObraTeatral(String nombre, Double costoRealizacion, Boolean esBenefico,
				Integer cantTotalActos, Boolean obraInmersiva){
		super(nombre,costoRealizacion,esBenefico); 
		this.cantTotalActos = cantTotalActos;
		this.obraInmersiva = obraInmersiva;
	}
	
	@Override
	public String imprimeCabecera(){
		return "OBRA TEATRAL: " + nombre  + " - BENEFICA: " + esBenefico.toString()
			+ " - INMERSIVA: " + obraInmersiva.toString() + "\n"; 
	} 
	
	@Override
	public String consultarDatos(){
		return imprimeCabecera() + super.consultarDatosArtistasyFuncionesEvento(); 
	}
	
	
	
	
	
}