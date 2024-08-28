import java.util.Date;
abstract class CitaMedica extends AtencionMedica{
	private String motivoCitaMedica;
	public CitaMedica(Paciente paciente, Medico medico, Date fechaHoraAtencion, String motivoCitaMedica){
		super(paciente, medico, fechaHoraAtencion);
		this.motivoCitaMedica = motivoCitaMedica;
	}
	@Override
	public abstract String consultarDatos();
	@Override
	public String datosCabecera(){
		return super.datosCabecera();
	}
}