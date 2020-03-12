package variables;

import java.util.concurrent.atomic.AtomicInteger;

public class ProductoInventario {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private final String nombre;
	private final int id;
	private final double precio;
	private final int stock;
	private final int cant;
	
	public ProductoInventario(String _nombre, double _precio, int _stock, int c) {
		nombre = _nombre;
		precio = _precio;
		stock = _stock;
		cant = c;
		id = count.incrementAndGet(); //Se comporta como un id
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getID() {
		return id;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public int getStock() {
		return stock;
	}
}
