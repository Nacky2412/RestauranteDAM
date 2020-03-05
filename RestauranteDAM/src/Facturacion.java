import java.util.Scanner;

public class Facturacion {

	// constructor
	private String id_producto;
	private String plato;
	private double cantidadComprada;
	private double precio;

	public void sacarFactura(Mesa mesa){
		Restaurante restaurante=new Restaurante();
		double total = 0;
		for (int i = 0; i < mesa.numeroPedidos(); i++) {
			int codigo= mesa.sacarCodigo();
			int cantidad=mesa.sacarNumPlatos(codigo);
			String plato=restaurante.devolverNombrePlato(String.valueOf(codigo));
			double precio=restaurante.devolverPrecioPlato(String.valueOf(codigo));
			
			System.out.println();
			System.out.println();
			System.out.printf("\n ID del producto: %s", codigo);
			System.out.printf("\n Nombre del plato: %s", plato);
			System.out.printf("\n Precio: %s", precio);
			System.out.printf("\n Cantidad: %s", cantidad);
			System.out.println();
			System.out.println();
			total = total + (precio*cantidad);
			
		}
		System.out.printf(" El total de la factura es: $%.2f\n", total);
	}

}

