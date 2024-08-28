import java.util.ArrayList; 

public abstract class Evento implements InfoProvider, IDataProvider{
	protected static Integer correlativo = 1; 
	protected Integer identificador; 
	protected String nombre; 
	protected Double costoRealizacion; 
	protected char tipoPublico; 
	protected Local local; 				 
	protected ArrayList<Funcion> funciones; 
	protected ArrayList<Artista> artistas;  //"un evento puede tener uno o mas artistas" 
	
	public Evento(String nombre, Double costoRealizacion, char tipoPublico){
		this.identificador = correlativo; 
		this.nombre = nombre;
		this.costoRealizacion = costoRealizacion;
		this.tipoPublico = tipoPublico;
		
		funciones = new ArrayList<Funcion>(); //reserva memoria para el arraylist :) 
		artistas = new ArrayList<Artista>(); 
		this.correlativo++; 
	}
	
	public void setLocal(Local local){
		this.local = local; 
	}
	
	//agregarFuncion(new Funcion(sdf.parse("14-09-2024"),LocalTime.of(20,00,00)));
	public void agregarFuncion(Funcion func){
		funciones.add(func); 
	}
	
	//agregarArtista(actor);
	public void agregarArtista(Artista artista){
		artistas.add(artista); 
	}
	
	public String linea(){
		return "-------------------------------------\n";
	}
	
	public String infoArtistas(){
		Integer id = 1; 
		String cad="";
		for(Artista ar: artistas){
			cad+="ARTISTA "+id.toString() +  ": ";
			cad +=ar.devolverDatos(); 
			id++;
		}	
		return cad; 
	}
	
	public String infoFunciones(){
		Integer id = 1;
		String cad="";
		for(Funcion fun: funciones){
			cad+="FUNCION "+id.toString() +  ": ";
			cad +=fun.devolverDatos(); 
			id++;
		}	
		return cad; 
	}
	
	public abstract String infoReq();
	
	@Override
	public String devolverDatos(){
		return devolverCabecera();
	}
	
	@Override
	public String devolverCabecera(){
		return "EVENTO Nro. " +identificador.toString()+"\n"+linea()
				+ "NOMBRE: " + nombre  + " - TIPO DE PUBLICO: " + tipoPublico+"\n" 
				+ infoArtistas() + local.devolverDatos()
				+ infoFunciones();
	}
}

//NOTA
//uso protected en esta clase para que solamente sus hijos tengan informacion del padre 
// asi evito hacer getters y setters 