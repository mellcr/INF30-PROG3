
import java.util.Date;			//Date      (fecha)
import java.time.LocalTime;		//Localtime (hora)

public class Curso extends ProgramaAcademico{
	private Integer cantHorasSem;
	private Integer cantCreditos;
	private Date fechaIni;
	private Date fechaFin;
	private DiaSemana diaDeDictado;
	private LocalTime horaIniClase;
	private LocalTime horaFinClase;
	
	//constructor por parametros de una clase abstacta -> lo usaran sus hijos
	public Curso(String nombre, String clave, char modalidad, double precio, 
					Integer cantHorasSem, Integer cantCreditos, Date fechaIni, Date fechaFin, DiaSemana diaDeDictado,
					LocalTime horaIniClase, LocalTime horaFinClase){
		super(nombre,clave,modalidad,precio);
		this.cantHorasSem = cantHorasSem;
		this.cantCreditos= cantCreditos;
		this.fechaIni= fechaIni;
		this.fechaFin= fechaFin;
		this.diaDeDictado= diaDeDictado;
		this.horaIniClase= horaIniClase;
		this.horaFinClase= horaFinClase;
	}
	
	@Override
	public String consultarDatos(){
		return "CURSO: " + clave + " - " + nombre + " - S/. "  + precio + " - CRED: " + cantCreditos;
	}
	
	
	
}