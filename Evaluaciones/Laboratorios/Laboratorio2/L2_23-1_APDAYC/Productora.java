import java.util.ArrayList; 

public class Productora{
	//Productora prod01 = new Productora(1,"Artes PERU");
	private String nombre; 
	private Integer identificador; 
	private ArrayList<Evento> eventos; 
	
	public Productora(Integer identificador, String nombre){
		this.identificador = identificador; 
		this.nombre = nombre; 
	}
	
	//prod01.setEventos(new ArrayList<>());
	public void setEventos(ArrayList<Evento> eventos){
		this.eventos = eventos; 
	}
	
	//prod01.getEventos().add(concert01);
	public ArrayList<Evento> getEventos(){
		return eventos; 
	}
	
	//reporte
	public String consultarEventos(){
		String cad =""; 
		for(Evento ev: eventos){
			cad+= ev.consultarDatos(); 
		}
		return cad; 
	}
	
	
	
}