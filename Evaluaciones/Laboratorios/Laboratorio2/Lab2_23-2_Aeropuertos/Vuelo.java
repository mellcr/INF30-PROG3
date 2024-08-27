
import java.time.LocalTime;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;

public class Vuelo{
	private static Integer correlativo=1; 
	private Integer identificador; 
	private String codigo; 
	private Date fechaSalida; 
	private LocalTime horaSalida; 
	private LocalTime horaLlegada; 
	
	private Avion avion; 
	private Remolque remolque; 
	private Aeropuerto aeropuertoSalida; 
	private Aeropuerto aeropuertoDestino; 
	
	// Vuelo vuelo01 = new Vuelo("LA2023",sdf.parse("25-08-2023"),LocalTime.of(13,00,00),
	//LocalTime.of(14,30,00));
	public Vuelo(String codigo, Date fechaSalida, LocalTime horaSalida, LocalTime horaLlegada){
		this.identificador = correlativo;
		this.codigo = codigo; 
		this.fechaSalida = fechaSalida; 
		this.horaSalida = horaSalida; 
		this.horaLlegada = horaLlegada; 
		
		this.correlativo++; 
	}
	
	
	public void setAvion(Avion avion){
		this.avion = avion;
	}
	
	public void setRemolque(Remolque remolque){
		this.remolque = remolque;
	}
	
	public void setAeropuertoSalida(Aeropuerto aeropuerto){
		this.aeropuertoSalida = aeropuerto; 
	}
	
	public void setAeropuertoLlegada(Aeropuerto aeropuerto){
		this.aeropuertoDestino = aeropuerto; 
	}	 
		 
	// public String devolverInformacion() {
        //Formateadores
        // SimpleDateFormat formatFecha = new SimpleDateFormat("dd-MM-yyyy");
        // DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        
        //Formatear fecha y horas
        // String fechaFormateada = formatFecha.format(fechaSalida);
        // String horaSalidaFormateada = horaSalida.format(formatTime);
        // String horaLlegadaFormateada = horaLlegada.format(formatTime);
        
        //Construir la cadena final usando concatenación de cadenas
        // String cad = "Datos del vuelo " + codigo + " con ID: " + identificador + "\n"; 
        // cad += "--------------------------------------------------------------------\n";
        // cad += "Fecha: " + fechaFormateada + " - " +
               // "Hora Salida: " + horaSalidaFormateada + " - " +
               // "Hora Llegada: " + horaLlegadaFormateada +  "\n";
			   
		// cad += avion.consultarDatos();	
        // cad += remolque.consultarDatos();
		// cad += "--------------------------------------------------------------------\n";
		// cad+= "DESDE:\n";
		// cad+= aeropuertoSalida.consultarDatos();
		// cad += "--------------------------------------------------------------------\n";
		// cad+= "HACIA:\n";
		// cad+= aeropuertoDestino.consultarDatos();
		
        // return cad; 
    // }
	
	public String devolverInformacion() {
        // Formateadores
        SimpleDateFormat formatFecha = new SimpleDateFormat("dd-MM-yyyy");
        //DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm");
        
        // Formatear fecha y horas
        String fechaFormateada = formatFecha.format(fechaSalida);
        //String horaSalidaFormateada = horaSalida.format(formatTime);
        //String horaLlegadaFormateada = horaLlegada.format(formatTime);
        
        // Construir la cadena final usando concatenación de cadenas
        String cad = "Datos del vuelo " + codigo + " con ID: " + identificador + "\n"; 
        cad += "--------------------------------------------------------------------\n";
        cad += "Fecha: " + fechaFormateada + " - " +
               "Hora Salida: " + horaSalida.toString() + " - " +
               "Hora Llegada: " + horaLlegada.toString() +  "\n";
			   
		cad += avion.consultarDatos();	
        cad += remolque.consultarDatos();
		cad += "--------------------------------------------------------------------\n";
		cad+= "DESDE:\n";
		cad+= aeropuertoSalida.consultarDatos();
		cad += "--------------------------------------------------------------------\n";
		cad+= "HACIA:\n";
		cad+= aeropuertoDestino.consultarDatos();
		
        return cad; 
    }
}