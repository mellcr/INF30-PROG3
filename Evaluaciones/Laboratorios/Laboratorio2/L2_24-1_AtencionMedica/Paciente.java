import java.util.ArrayList;

public class Paciente extends Persona{
	private Integer numHC;
	private ArrayList<AtencionMedica> atencionesMed; 
	
	public Paciente(String DNI, String nombre, String paterno, String materno,
			Integer numHC){
		super(DNI,nombre,paterno,materno);
		this.numHC = numHC;
	}
	
	// pac01.setAtencionesMedicas(new ArrayList<>());
	public void setAtencionesMedicas(ArrayList<AtencionMedica> at){
		this.atencionesMed = at; 
	}
		 // pac01.getAtencionesMedicas().add(atm01);
	public ArrayList<AtencionMedica> getAtencionesMedicas(){
		return atencionesMed;
	}
	
	@Override
	public String devolverInformacion(){
		return "PACIENTE: " + DNI  +" - " + nombre + " "+ paterno +" "+ materno +"\n";
	}
	
	
}