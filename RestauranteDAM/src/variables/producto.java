package variables;

public class producto {
	private String nombreProducto;
	private double precio;
	
	public producto (String _nombreComida, double _precio) {
		nombreProducto = _nombreComida;
		precio = _precio;
	}
	
	String cogerNombreComida() {
		return nombreProducto;
	}
	
	double verPrecio() {
		return precio;
	}
}
