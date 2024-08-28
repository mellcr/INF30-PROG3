import java.util.Date; 

public class ConsultaPresencial extends CitaMedica{
	private Consultorio consultorio;
	private Boolean requiereAsistEsp;
	
	// ConsultaPresencial(pac01, med01, sdf.parse("29-03-2024 16:00"),          - "DOLOR DE ESPALDA", con01, false);
	public ConsultaPresencial(Paciente paciente, Medico medico, Date fechaAtenc, String motivo,
							Consultorio consultorio, Boolean requiereAsistEsp){
		super(paciente,medico,fechaAtenc,motivo);
		this.consultorio = consultorio;
		this.requiereAsistEsp = requiereAsistEsp;
	}
	
	@Override
	public String devolverInformacion(){
		return "";
	}
	
}