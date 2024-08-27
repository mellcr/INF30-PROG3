import java.util.ArrayList;
import java.util.Date; 			//fecha
import java.time.LocalTime;  	//hora

public class Funcion{
	private Date fecha;
	private LocalTime horaIni;
	private LocalTime horaFin;
	private Local local; 
	
	public Funcion(Date fecha, LocalTime horaIni, LocalTime horaFin, Local local){
		this.fecha = fecha;
		this.horaIni = horaIni;
		this.horaFin = horaFin;
		this.local = local;
	}
	
	public Date getFecha(){
		return fecha;
	}
	
	public LocalTime getHoraInicio(){
		return horaIni;
	}
	
	public LocalTime getHoraFin(){
		return horaFin;
	}
	
	public Local getLocal(){
		return local; 
	}
}