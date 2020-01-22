import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    Scanner s = new Scanner(System.in);
    public static void hacerPedidos(){
        boolean salir = false;
        System.out.print("Introduce la ID y la CANT del producto (0 para salir) ");
        do{
            System.out.print("ID: ");
            int id = s.nextInt();
            if(id == 0){
                salir = true;
            }else{
                System.out.print("CANTIDAD: ");
                int cant = s.nextInt();
            }
        }while(!salir);
    }
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

        Scanner s = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();
        Mesa mesa = new Mesa();
        System.out.println("    BIENVENIDO A RestauranteDAM     ");
        System.out.println("1. Restaurante");
        System.out.println("2. Facturacion");
        System.out.print("Opcion: ");
        int opcion_1 = s.nextInt();

        switch (opcion_1) {
        // RESTAURANTE
        case 1:
            System.out.print("Cuantos sois? ");
            int numPersonas = s.nextInt();
            System.out.print("Elige una mesa: ");
            System.out.println("MESA 1");
            System.out.println("MESA 2");
            System.out.println("MESA 3");
            System.out.println("MESA 4");
            System.out.println("MESA 5");
            System.out.println("MESA 6");
            System.out.println("MESA 7");
            System.out.println("MESA 8");
            System.out.println("MESA 9");
            System.out.println("MESA 10");
            System.out.println("MESA 11");
            System.out.println("MESA 12");
            System.out.println("MESA 13");
            System.out.println("MESA 14");
            System.out.println("MESA 15");
            int opcionMesa = s.nextInt();
            switch (opcionMesa) {
                case 1:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 2:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 3:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 4:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 5:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 6:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 7:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 8:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 9:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 10:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 11:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 12:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 13:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 14:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
                case 15:
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    break;
            }

            break;
        // FACTURACION
        case 2:
            break;
        default:
            System.out.println("ERROR. Elige una opcion valida");
        }

    }
}