
import java.util.Date; //fecha
import java.time.LocalTime; //hora
import java.text.SimpleDateFormat;

public class Taller extends ProgramaAcademico{
	private Date fechaRealizacion;
	private LocalTime horaIni;
	private LocalTime horaFin;
	
	//constructor por parametros de una clase abstacta -> lo usaran sus hijos
	public Taller(String nombre, String clave, char modalidad, double precio, 
					Date fechaRealizacion,LocalTime horaIni, LocalTime horaFin){
		super(nombre,clave,modalidad,precio);
		this.fechaRealizacion = fechaRealizacion;
		this.horaIni= horaIni;
		this.horaFin= horaFin;
	}
	
	@Override
	public String consultarDatos(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyy");
		return "TALLER: " + clave + " - " + nombre + " - S/. "  + precio + " - Fecha: " + sdf.format(fechaRealizacion);
		
		//Parse: 	String -> date
		//Format: 	date -> String
		// " - Fecha: " + fechaRealizacion;  -> sale cualquier cosa 
	}
	
	
	
}