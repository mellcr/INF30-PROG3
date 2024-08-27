
public abstract class Artista implements IConsultable{
	protected String nombArtista; 
	protected OrigenArtista origen; 
	
	public Artista(String nombArtista, OrigenArtista origen){
		this.nombArtista = nombArtista;
		this.origen = origen;
	}
	
	
}