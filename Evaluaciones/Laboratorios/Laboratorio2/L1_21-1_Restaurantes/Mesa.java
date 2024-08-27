
public class Mesa {
	private Integer id; 
	private Integer capacidadMaxPer; 
	
	//constructor
	public Mesa(Integer id, Integer capacidadMaxPer){
		this.id = id;
		this.capacidadMaxPer= capacidadMaxPer;
	}
	
	public Integer getId(){
		return id; 
	}
	
}