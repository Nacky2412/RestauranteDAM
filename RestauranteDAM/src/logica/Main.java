package logica;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    static Scanner s;
    
    public static void main(String[] args) {
        // HORA

		/**
		 * @param Hora h se llama a la funcion hora 
		 */
		Hora h = new Hora();
		// variable que recoge la hora de la funcion date
		String hora = h.date();
		// Aquí colocas tu objeto tipo Date
		Date myDate = new Date();
		// se imprime la hora
		System.out.print(hora+" ");
		// Aquí obtienes el formato que deseas
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(myDate));

        s = new Scanner(System.in);
        //Restaurante restaurante = new Restaurante();
        //Facturacion facturacion= new Facturacion();
        System.out.println("    BIENVENIDO A RestauranteDAM     ");
        System.out.println("1. Restaurante");
        System.out.println("2. Facturacion");
        System.out.print("Opcion: ");
        int opcion_1 = s.nextInt();

        switch (opcion_1) {
        case 1:
        //restaurante.verMesas();
            break;
        case 2:
        //facturacion.verFacturas();
            break;
        default:
            System.out.println("ERROR. Elige una opcion valida");
        }

    }
}