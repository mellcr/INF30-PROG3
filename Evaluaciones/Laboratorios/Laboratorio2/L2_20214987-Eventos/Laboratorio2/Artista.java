import java.util.ArrayList;

public class Artista implements InfoProvider{
	private String nombre; 
	private String nacionalidad; 
	private ArrayList <Artista> artistas; //asi era xd 
	
	
	public Artista(String nombre, String nacionalidad){
		this.nombre = nombre; 
		this.nacionalidad = nacionalidad; 
		//espacio de memoria 
		artistas = new ArrayList<Artista>(); 
	}
	
	public void agregarArtista(Artista artInt1){
		artistas.add(artInt1); 
	}
	
	@Override
	public String devolverDatos(){
		return "ARTISTA: " + nombre +  "\n";
	}
	
}