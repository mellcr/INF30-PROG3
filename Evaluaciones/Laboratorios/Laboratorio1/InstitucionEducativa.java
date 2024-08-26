import java.util.ArrayList; //instEd (1,n) sedes

public class InstitucionEducativa{
	private Integer idInstitucionEducativa;
	private String RUC;
	private String nombre;
	private ArrayList <Sede> sedes;
	
	//constructor por parametros
	public InstitucionEducativa(Integer idInstitucionEducativa, String RUC, String nombre){
		this.idInstitucionEducativa = idInstitucionEducativa;
		this.RUC = RUC;
		this.nombre= nombre;
	}
	
	//setea las sedes
	public void setSedes(ArrayList<Sede> sedes){
		this.sedes = sedes;
		//main: ie1.setSedes(new ArrayList<>());
	}
	
	public ArrayList<Sede> getSedes(){
		return sedes;
	}
	
	public String consultarProgramasDeSede(Integer indiceSede){
		//.get -> devuuelve el elemento del arraylist en ese indice
		String cadena = "Programas disponibles para " + sedes.get(indiceSede).getNombre() + "\n";
		cadena += sedes.get(indiceSede).consultarProgramas();
		return cadena;
	}
	
}