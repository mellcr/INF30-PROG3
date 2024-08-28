import java.util.Date; 
import java.text.SimpleDateFormat; 

public abstract class AtencionMedica implements IConsultable{
	protected Date fechaCreacion;
	protected Date fechaAtenc; 
	protected EstadoAtencion estado; 
	protected Paciente paciente; 
	protected Medico medico; 
	protected Integer identificador; 
	protected static Integer correlativo = 1; 
	
	// ConsultaPresencial(pac01, med01, sdf.parse("29-03-2024 16:00"),          - "DOLOR DE ESPALDA", con01, false);
	public AtencionMedica(Paciente paciente, Medico medico, Date fechaAtenc){
		this.identificador = correlativo; 
		this.paciente = paciente; 
		this.medico= medico; 
		this.fechaAtenc = fechaAtenc;
		
		this.fechaCreacion = new Date(); 
		this.estado = estado.PROGRAMADA; 
		this.correlativo++;
	}
	
	public String cabecera(){
		SimpleDateFormat aux = new SimpleDateFormat("dd-MM-yyyy HH:mm"); 
		return "ID: "+ identificador + " - CREACION: " +aux.format(fechaCreacion)+ " - ATENCION: " + aux.format(fechaAtenc)+" - " + estado+"\n"; 
	}
	
	public String consultarDatos(){
		return cabecera() + medico.devolverInformacion()+ paciente.devolverInformacion() ; 
	}
	
}