import java.util.Date; 

public class Persona extends Artista{
	private String nombre;
	private String apellido;
	private Date fNacimiento;
	private char genero; 
	//"MARCIANO CANTERO",OrigenArtista.INTERNACIONAL,"HORACIO", "CANTERO", sdf.parse("25-08-1960"), 'M');
	public Persona(String nombArtista, OrigenArtista origen,
		String nombre, String apellido, Date fNacimiento, char genero){
		super(nombArtista,origen); 
		this.nombre = nombre;
		this.apellido = apellido;
		this.fNacimiento = fNacimiento;
		this.genero = genero;
	}
	
	@Override
	public String consultarDatos(){
		return "PERSONA: " + nombArtista + " - " + origen + "\n"; 
	}
	

}