
public class ObraTeatral extends Evento{
	private Integer numeroActosObra;
	private Boolean requiereEscenografia;
	
	public ObraTeatral(String nombre, Double costoRealizacion, char tipoPublico,
				Integer numeroActosObra, Boolean requiereEscenografia){
		super(nombre,costoRealizacion,tipoPublico); 
		this.numeroActosObra = numeroActosObra;
		this.requiereEscenografia = requiereEscenografia;
		
	}
	
	@Override
	public String infoReq(){
		String cad="";
		if(requiereEscenografia==true) cad = "SI"; 
		else cad = "NO"; 
		return cad; 
	}
	
	@Override
	public String devolverCabecera(){
		return super.devolverCabecera()+ "OBRA TEATRAL - NUM. ACTOS: "
			+ numeroActosObra.toString() + "\nREQ. ESCENOGRAFIA: " + infoReq()+"\n"+
			super.linea();
	}
	
	
}