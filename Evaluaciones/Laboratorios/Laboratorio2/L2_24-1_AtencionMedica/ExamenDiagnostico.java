import java.util.Date; 

public class ExamenDiagnostico extends AtencionMedica{
	private TipoExamen tipoExam;
	private SalaEspecializada sala; 
	
	//new ExamenDiagnostico(pac01, med02, sdf.parse("30-03-2024 08:30"), sal01, TipoExamen.ECOGRAFIA);
	public ExamenDiagnostico(Paciente paciente, Medico medico, Date fechaAtenc, SalaEspecializada sala,TipoExamen tipoExam){
		super(paciente,medico,fechaAtenc);
		this.tipoExam = tipoExam;
		this.sala = sala;
	}
	
	@Override
	public String devolverInformacion(){
		return "SALA ESPECIALIZADA: "+sala.getNombre() + " - TORRE: "+"\n";
	}
	
	@Override
	public String consultarDatos(){
		return super.consultarDatos() + devolverInformacion(); 
	}
	
	
}