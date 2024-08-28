class Consultorio extends AmbienteClinico{
	private String numero;
	public Consultorio(double especioEnMetrosCuadrados, char torre, int piso, String numero){
		super(especioEnMetrosCuadrados, torre, piso);
		this.numero = numero;
	}
	@Override
	public String devolverInformacion(){
		return "CONSULTORIO:" + numero + " - TORRE:" + getTorre() + " - PISO:" + getPiso() + "\n";
	}
}