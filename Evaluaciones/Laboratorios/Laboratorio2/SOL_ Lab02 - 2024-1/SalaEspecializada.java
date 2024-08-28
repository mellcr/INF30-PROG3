class SalaEspecializada extends AmbienteClinico{
	private String nombre;
	private boolean poseeEquipamientoImagenologia;
	public SalaEspecializada(double especioEnMetrosCuadrados, char torre, int piso, String nombre, boolean poseeEquipamientoImagenologia){
		super(especioEnMetrosCuadrados, torre, piso);
		this.nombre = nombre;
		this.poseeEquipamientoImagenologia = poseeEquipamientoImagenologia;
	}
	@Override
	public String devolverInformacion(){
		return "SALA ESPECIALIZADA:" + nombre + " - TORRE:" + getTorre() + " - PISO:" + getPiso() + " - EQ. IMAGENOLOGIA:" + (poseeEquipamientoImagenologia?"SI":"NO") + "\n";  
	}
}