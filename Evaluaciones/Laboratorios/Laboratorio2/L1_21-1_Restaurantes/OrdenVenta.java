import java.util.ArrayList; 

public class OrdenVenta{
	private Integer id; 
	private Double total; 
	private Cliente cliente; 
	private Mesero mesero; 
	private Mesa mesa; 
	private ArrayList<LineaOrdenVenta> lineaOrdenVentas; 
	
	//constructor
	public OrdenVenta(Integer id){
		this.id = id;
		//espacio de memoria para la linea de orden de venta 
		lineaOrdenVentas = new ArrayList<LineaOrdenVenta>(); 
	}
	
	//setters
	public void setMesa(Mesa mesa){
		this.mesa = mesa; 
	}
	
	public void setMesero(Mesero mesero){
		this.mesero = mesero; 
	}
	
	public void setCliente(Cliente cliente){
		this.cliente = cliente;  
	}
	
	//metodos
	public void agregarLineaOrdenVenta(LineaOrdenVenta lineaOrd){
		lineaOrdenVentas.add(lineaOrd); 
	}
	
	public void calcularSubtotalesyTotal(){
		Double auxtotal=0.0; 
		
		//operaciones...
		for(LineaOrdenVenta lov: lineaOrdenVentas){
			auxtotal+= lov.calcularSubTotal(); 
		}
		total = auxtotal; 
	}
	
	public String impreLin(){
		return "---------------------------------------------\n"; 
	}
	
	public String cabecera(){
		return "Reporte Orden Nro. " + id.toString() +"\n"+ impreLin(); 
	}
	
	public String detallleAtencion(){
		return "Mesa Nro. " + mesa.getId().toString()+ "\n" + impreLin() + 
			mesero.consultarDatos() + cliente.consultarDatos() + impreLin(); 
	}
	
	public String detalllePedido(){
		String cad = ""; 
		for(LineaOrdenVenta lov: lineaOrdenVentas){
			cad+= lov.generarImpresion();
		}
		return cad + impreLin(); 
	}
	
	public String generarReporte(){
		//genera el reporte
		
		return cabecera() + detallleAtencion() + detalllePedido() + "TOTAL: S/. " + 
					total.toString(); 
	}
}