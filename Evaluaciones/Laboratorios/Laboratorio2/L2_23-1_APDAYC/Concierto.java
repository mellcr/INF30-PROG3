import java.util.ArrayList; 

public class Concierto extends Evento{
	private Boolean esAcustico; 
	private Boolean ofreceTecAsistiva; 
	
	//new Concierto("ENANITOS VERDES EN TRACCION ACUSTICA",
	//10000.00,false,true,true);
	public Concierto(String nombre, Double costoRealizacion, Boolean esBenefico,
				Boolean esAcustico, Boolean ofreceTecAsistiva){
		super(nombre,costoRealizacion,esBenefico); 
		this.esAcustico = esAcustico;
		this.ofreceTecAsistiva = ofreceTecAsistiva;
	}
	
	@Override
	public String imprimeCabecera(){
		return "CONCIERTO: " + nombre  + " - ACUSTICO: " + esAcustico.toString()
			+ " - TEC ASISTIVA: " + ofreceTecAsistiva.toString()+ "\n"; 
	} 
	
	@Override
	public String consultarDatos(){
		return imprimeCabecera() + super.consultarDatosArtistasyFuncionesEvento(); 
	}
	
	
	
	
}