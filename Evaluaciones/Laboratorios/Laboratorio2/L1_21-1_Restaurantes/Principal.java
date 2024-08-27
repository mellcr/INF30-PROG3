
class Principal{
    public static void main(String[] args){
        //Se crean tres mesas
        Mesa mesa1 = new Mesa(1, 2);
        Mesa mesa2 = new Mesa(2, 2);
        Mesa mesa3 = new Mesa(3, 4);
        //Se crea un mesero
        Mesero mesero1 = new Mesero(1, "BRUNO", "ORBEGOSO", "27982001", 1500.00);
        //Se crea un cliente
        Cliente cliente1 = new Cliente(1, "MIRIAM", "NARVAEZ", "38722930", Categoria.VIP);
        //Se crean dos platos
        Plato plato1 = new Plato(1, "AJI DE GALLINA", 25.00);
        Plato plato2 = new Plato(2, "ARROZ CON POLLO", 22.00);
        //Se crea una bebida
        Bebida bebida1 = new Bebida(3, "INKA KOLA", 0.5, "lts", 5.00);
        //Se crea una orden de venta
        OrdenVenta ov1 = new OrdenVenta(1);
        //Se asigna la mesa de la cual proviene la orden de venta
        ov1.setMesa(mesa2);
        //Se asigna el mesero a la orden de venta
        ov1.setMesero(mesero1);
        //Se asigna el cliente a la orden de venta
        ov1.setCliente(cliente1);
        //Se crean las líneas de orden de venta
        LineaOrdenVenta lov1 = new LineaOrdenVenta(plato1, 2);
        LineaOrdenVenta lov2 = new LineaOrdenVenta(plato2, 1);
        LineaOrdenVenta lov3 = new LineaOrdenVenta(bebida1, 1);
        //Se agregan las líneas a la orden de venta
        ov1.agregarLineaOrdenVenta(lov1);
        ov1.agregarLineaOrdenVenta(lov2);
        ov1.agregarLineaOrdenVenta(lov3);
        //Calculamos los subtotales y el total
        ov1.calcularSubtotalesyTotal();
        //Generamos el reporte
        String reporte = ov1.generarReporte();
        System.out.println(reporte);
		/**/
    }
}
