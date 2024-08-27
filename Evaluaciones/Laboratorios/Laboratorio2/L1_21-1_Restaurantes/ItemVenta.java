
public abstract class ItemVenta implements IConsulta{
	protected Integer id; 
	protected Double precio; 
	
	//constructor
	public ItemVenta(Integer id, Double precio){
		this.id = id;
		this.precio= precio;
	}
	
	//getter
	public Double getPrecio(){
		return precio; 
	}
	
	
}