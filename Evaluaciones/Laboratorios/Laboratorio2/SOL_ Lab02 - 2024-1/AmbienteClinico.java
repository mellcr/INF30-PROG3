abstract class AmbienteClinico implements IConsultable{
	private double especioEnMetrosCuadrados;
	private char torre;
	private int piso;
	public AmbienteClinico(double especioEnMetrosCuadrados, char torre, int piso){
		this.especioEnMetrosCuadrados = especioEnMetrosCuadrados;
		this.torre = torre;
		this.piso = piso;
	}
	public char getTorre(){
		return torre;
	}
	public int getPiso(){
		return piso;
	}
	public abstract String devolverInformacion();
}