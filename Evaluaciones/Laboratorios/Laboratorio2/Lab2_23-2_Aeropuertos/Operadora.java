public class Operadora extends Empresa{
	private Boolean ofrecenSoporteLog; 
	private Boolean ofrecenAsistenciaNav; 
	//falta
	
	//constructor 
	public Operadora(String nombre, Boolean ofrecenSoporteLog,Boolean ofrecenAsistenciaNav){
		super(nombre); 
		this.ofrecenSoporteLog = ofrecenSoporteLog;
		this.ofrecenAsistenciaNav = ofrecenAsistenciaNav;
	}
	
	//getters y setters
	@Override
	public String toString(){
		return "Operadora: " + nombre+ " - Soporte Logistico: " + ofrecenSoporteLog.toString() + " - Asistencia Nav: " + ofrecenAsistenciaNav.toString()+"\n";
	}
	
	
}