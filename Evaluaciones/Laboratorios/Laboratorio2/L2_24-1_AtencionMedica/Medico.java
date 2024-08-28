
public class Medico extends Persona{
	private Especialidad especialidad;
	private String numColegiatura;
	private String numRegEsp;
	
	public Medico(String DNI, String nombre, String paterno, String materno,
			Especialidad especialidad, String numColegiatura, String numRegEsp){
		super(DNI,nombre,paterno,materno);
		this.especialidad = especialidad;
		this.numColegiatura = numColegiatura;
		this.numRegEsp = numRegEsp;
	}
	
	@Override
	public String devolverInformacion(){
		return "MEDICO: " + nombre  +" " + paterno +" "+ materno +" - CMP: " + numColegiatura + " - ESPECIALIDAD: " + especialidad.getNombre()+"\n";
	}
	
	
}