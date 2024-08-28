import java.util.Date;
import java.text.SimpleDateFormat;
abstract class AtencionMedica{
	private static int numCorrelativo = 0;
	private int idAtencionMedica;
	private Paciente paciente;
	private Medico medico;
	private Date fechaHoraCreacion;
	private Date fechaHoraAtencion;
	private EstadoAtencion estadoAtencion;
	public AtencionMedica(Paciente paciente, Medico medico, Date fechaHoraAtencion){
		numCorrelativo++;
		this.idAtencionMedica = numCorrelativo;
		this.paciente = paciente;
		this.medico = medico;
		this.fechaHoraCreacion = new Date();
		this.fechaHoraAtencion = fechaHoraAtencion;
		this.estadoAtencion = EstadoAtencion.PROGRAMADA;
	}
	public abstract String consultarDatos();
	public String datosCabecera(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm");
		return "ID:" + idAtencionMedica + " - CREACION:" + sdf.format(fechaHoraCreacion) + "- ATENCION:" + sdf.format(fechaHoraAtencion) + " - " + estadoAtencion + "\n" + medico.devolverInformacion() + paciente.devolverInformacion();
	}
}