import java.util.ArrayList; 

public class Agrupacion extends Artista{
	private Integer anhoConformacion; 
	private ArrayList<Persona> personas; 
	
	//new Agrupacion("LOS ENANITOS VERDES",OrigenArtista.INTERNACIONAL, 1979);
	public Agrupacion(String nombArtista, OrigenArtista origen, Integer anhoConformacion){
		super(nombArtista,origen); 
		this.anhoConformacion = anhoConformacion;
	}
	
	//getters y setters
	public void setMiembros(ArrayList<Persona> personas){
		this.personas = personas; 
	}
	
	public ArrayList<Persona> getMiembros(){
		return personas; 
	}
	
	@Override
	public String consultarDatos(){
		return "AGRUPACION: " + nombArtista + " - " + origen + " - "+
				anhoConformacion.toString()+ "\n"; 
	}
}