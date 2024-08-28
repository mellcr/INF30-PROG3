
import java.util.Date; 

public abstract class CitaMedica extends AtencionMedica{   //es abstract OJO 
	protected String motivo;
	
	// ConsultaPresencial(pac01, med01, sdf.parse("29-03-2024 16:00"),          - "DOLOR DE ESPALDA", con01, false);
	public CitaMedica(Paciente paciente, Medico medico, Date fechaAtenc, String motivo){
		super(paciente,medico,fechaAtenc);
		this.motivo = motivo;
	}
	
	@Override
	public abstract String devolverInformacion();
	
	@Override
	public String consultarDatos(){
		return super.consultarDatos() ; 
	}
}

