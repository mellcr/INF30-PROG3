import java.util.Date; 

public class Teleconsulta extends CitaMedica{
	private Plataforma plataforma;
	private String enlace;
	
	
	public Teleconsulta(Paciente paciente, Medico medico, Date fechaAtenc, String motivo,
							Plataforma plataforma, String enlace){
		super(paciente,medico,fechaAtenc,motivo);
		this.plataforma = plataforma;
		this.enlace = enlace;
	}
	
	@Override
	public String devolverInformacion(){
		return "";
	}
}