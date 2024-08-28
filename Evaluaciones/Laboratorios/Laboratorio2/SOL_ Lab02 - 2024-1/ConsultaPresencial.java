import java.util.Date;
class ConsultaPresencial extends CitaMedica{
	private Consultorio consultorio;
	private boolean pacienteRequiereAsistenciaEspecial;
	public ConsultaPresencial(Paciente paciente, Medico medico, Date fechaHoraAtencion, String motivoCitaMedica, Consultorio consultorio, boolean pacienteRequiereAsistenciaEspecial){
		super(paciente, medico, fechaHoraAtencion, motivoCitaMedica);
		this.consultorio = consultorio;
		this.pacienteRequiereAsistenciaEspecial = pacienteRequiereAsistenciaEspecial;
	}
	@Override
	public String consultarDatos(){
		return super.datosCabecera() + consultorio.devolverInformacion() + "REQ. ASISTENCIA:" + (pacienteRequiereAsistenciaEspecial?"SI":"NO")+ "\n";
	}
}