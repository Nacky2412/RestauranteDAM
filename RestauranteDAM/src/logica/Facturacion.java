package logica;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Facturacion {
	
	public static String sacarFactura(Mesa mesa){
		String cadena="";
		Hora h = new Hora();
		// variable que recoge la hora de la funcion date
		String hora = h.date();
		// Aquí colocas tu objeto tipo Date
		Date myDate = new Date();
		// se imprime la hora
		cadena+=hora;
		cadena+=" ";
		// Aquí obtienes el formato que deseas
		cadena+=String.valueOf(new SimpleDateFormat("dd-MM-yyyy").format(myDate));
		cadena+="\n";
		Carta restaurante=new Carta();
		double total = 0;

		for (int i = 0; i < mesa.getMesa().length; i++) {
			
			int cantidad=mesa.sacarNumPlatos(i);
			if (cantidad>0) {
				int codigo= mesa.sacarCodigo(i);
				String plato=restaurante.devolverNombrePlato(String.valueOf(codigo));
				double precio=restaurante.devolverPrecioPlato(String.valueOf(codigo));
				
				cadena+="\n ID del producto: "+ String.valueOf(codigo);
				cadena+="\n Nombre del plato: "+ String.valueOf(plato);
				cadena+="\n Precio: "+ String.valueOf(precio);
				cadena+="\n Cantidad: " +String.valueOf(cantidad);
				cadena+="\n";
				total = total + (precio*cantidad);
			}
		}
		cadena+="El total de la factura es: "+ total+" euros";
		return cadena;
	}

}

