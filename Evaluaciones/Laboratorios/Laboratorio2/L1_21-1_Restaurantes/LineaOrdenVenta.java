
public class LineaOrdenVenta{
	private ItemVenta itemVendido; 
	private Integer cantSolicitada; 
	private Double total; 
	
	//LineaOrdenVenta(plato1, 2);
	//constructor
	public LineaOrdenVenta(ItemVenta itemVendido,Integer cantSolicitada){
		this.itemVendido = itemVendido;
		this.cantSolicitada = cantSolicitada;
		total = cantSolicitada*itemVendido.getPrecio(); 
	}
	
	public Double getTotal(){
			return total; 
	}
	
	public Double calcularSubTotal(){
			return cantSolicitada*itemVendido.getPrecio();  
	}
	
	//impresion de una liena de orden de venta :) 
	public String generarImpresion(){
		return itemVendido.consultarDatos() + " --->  S/. " + total.toString() + "\n";  
	}
}