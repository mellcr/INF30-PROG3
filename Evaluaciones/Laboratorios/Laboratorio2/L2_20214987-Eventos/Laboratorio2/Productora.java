import java.util.ArrayList; 

public class Productora{
	private String nombre; 
	private ArrayList<Evento> eventos; //" una productora tiene asociados varios eventos "
	
	public Productora(String nombre){
		this.nombre = nombre; 
		eventos = new ArrayList<Evento>(); 
	}
	
	//prod1.agregarEvento(evento2);
	public void agregarEvento(Evento evento){
		eventos.add(evento);
	}
	
	/*System.out.print(prod1.consultarDatosEvento(0));
		System.out.print(prod1.consultarObrasTeatrales());
	*/
	public String consultarDatosEvento(Integer indice){
		return eventos.get(indice).devolverDatos();
	}
	
	public String consultarObrasTeatrales(){
		String cad="";
		for(Evento ev: eventos){
			if(ev instanceof ObraTeatral){
				cad +=ev.devolverDatos();
			}
		}
		return cad; 
	}
	
}