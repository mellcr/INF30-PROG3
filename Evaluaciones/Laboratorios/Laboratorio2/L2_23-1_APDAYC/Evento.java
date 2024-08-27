import java.util.ArrayList; 
import java.util.Date; 
import java.time.LocalTime; 
import java.text.SimpleDateFormat; 

public abstract class Evento implements IConsultable{
	protected String nombre; 
	protected Double costoRealizacion; 
	protected Boolean esBenefico; 
	protected Integer correlativo = 1; 
	protected Integer identificador; 
	protected ArrayList<Funcion> funciones;
	protected ArrayList<Artista> artistas; 
	
	public Evento(String nombre, Double costoRealizacion, Boolean esBenefico){
		this.nombre = nombre;
		this.costoRealizacion = costoRealizacion;
		this.esBenefico = esBenefico;
	}
	
	//.setfuncion(new ArrayList<>());
	public void setFunciones(ArrayList<Funcion> funciones){
		this.funciones = funciones; 
	}
	
	public ArrayList<Funcion> getFunciones(){
		return funciones; 
	}
	
	//concert01.setArtistas(new ArrayList<>());
	public void setArtistas(ArrayList<Artista> artistas){
		this.artistas = artistas; 
	}
	
	//concert01.getArtistas().add(agrupacion01);
	public ArrayList<Artista> getArtistas(){
		return artistas; 
	}
	
	//
	public String consultarDatosArtistasyFuncionesEvento(){
		 SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		 String cadena = "ARTISTAS: " + "\n";
		 for(Artista artista : artistas){
			cadena += "- " + artista.consultarDatos();
		 }
		 cadena += "FUNCIONES: " + "\n";
		 for(Funcion funcion : funciones){
			cadena += "- Fecha: " + sdf.format(funcion.getFecha()) + " - Hora Inicio:" +
				funcion.getHoraInicio() + " en " + funcion.getLocal().getNombre() + "\n";
		 }
		 return cadena;
	}
	
	public abstract String imprimeCabecera(); 
	
	
}