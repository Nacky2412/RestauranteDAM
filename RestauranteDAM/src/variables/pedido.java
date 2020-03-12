package variables;

public class pedido {
	private producto comida;
	private int cant;
	private double precioTotal;
	
	public pedido(producto _comida, int _cant) {
		comida = _comida;
		cant = _cant;
		precioTotal = comida.verPrecio() * cant;
	}
	
	String cogerNombreProducto() {
		return comida.cogerNombreComida();
	}
	
	double verPrecioTotal() {
		return precioTotal;
	}
	
	double verPrecioInvidual() {
		return comida.verPrecio();
	}
}
