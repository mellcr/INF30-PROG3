
public class Concierto extends Evento{
	private TipoConcierto tipoCon;
	private Boolean permisoGrabar;
	
	public Concierto(String nombre, Double costoRealizacion, char tipoPublico,
				TipoConcierto tipoCon, Boolean permisoGrabar){
		super(nombre,costoRealizacion,tipoPublico); 
		this.tipoCon = tipoCon;
		this.permisoGrabar = permisoGrabar;
		
	}
	
	@Override
	public String infoReq(){
		String cad="";
		if(permisoGrabar==true) cad = "SI"; 
		else cad = "NO"; 
		return cad; 
	}
	
	@Override
	public String devolverCabecera(){
		return super.devolverCabecera()+ "CONCIERTO - TIPO: "
			+ tipoCon + "\nPERMISO GRABACION: " + infoReq()+"\n"+
			super.linea();
	}
	
}