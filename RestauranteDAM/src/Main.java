import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    static Scanner s;
    public static Mesa hacerPedidos(Mesa mesa){
        boolean salir = false;
        System.out.print("Introduce la ID y la CANT del producto (0 para salir) ");
        do{
            System.out.print("ID: ");
            int id = s.nextInt();
            if(id == 0){
                salir = true;
            }else{
                System.out.print("CANTIDAD: ");
                int cantidad = s.nextInt();
                mesa.setPedidos(id, cantidad);
            }
        }while(!salir);
        return mesa;
    }
    public static void sacarFactura(Mesa mesa){
        System.out.println("Factura");
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

        s = new Scanner(System.in);
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
            System.out.println("Elige una mesa: ");
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
                    Mesa mesa1= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa1=hacerPedidos(mesa1);
                    sacarFactura(mesa1);
                    mesa1.verPedidos();
                    break;
                case 2:
                    Mesa mesa2= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa2=hacerPedidos(mesa2);
                    sacarFactura(mesa2);
                    mesa2.verPedidos();
                    break;
                case 3:
                    Mesa mesa3= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa3=hacerPedidos(mesa3);
                    sacarFactura(mesa3);
                    mesa3.verPedidos();
                    break;
                case 4:
                    Mesa mesa4= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa4=hacerPedidos(mesa4);
                    sacarFactura(mesa4);
                    mesa4.verPedidos();
                    break;
                case 5:
                    Mesa mesa5= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa5=hacerPedidos(mesa5);
                    sacarFactura(mesa5);
                    mesa5.verPedidos();
                    break;
                case 6:
                    Mesa mesa6= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa6=hacerPedidos(mesa6);
                    sacarFactura(mesa6);
                    mesa6.verPedidos();
                    break;
                case 7:
                    Mesa mesa7= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa7=hacerPedidos(mesa7);
                    sacarFactura(mesa7);
                    mesa7.verPedidos();
                    break;
                case 8:
                    Mesa mesa8= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa8=hacerPedidos(mesa8);
                    sacarFactura(mesa8);
                    mesa8.verPedidos();
                    break;
                case 9:
                    Mesa mesa9= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa9=hacerPedidos(mesa9);
                    sacarFactura(mesa9);
                    mesa9.verPedidos();
                    break;
                case 10:
                    Mesa mesa10= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa10=hacerPedidos(mesa10);
                    sacarFactura(mesa10);
                    mesa10.verPedidos();
                    break;
                case 11:
                    Mesa mesa11= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa11=hacerPedidos(mesa11);
                    sacarFactura(mesa11);
                    mesa11.verPedidos();
                    break;
                case 12:
                    Mesa mesa12= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa12=hacerPedidos(mesa12);
                    sacarFactura(mesa12);
                    mesa12.verPedidos();
                    break;
                case 13:
                    Mesa mesa13= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa13=hacerPedidos(mesa13);
                    sacarFactura(mesa13);
                    mesa13.verPedidos();
                    break;
                case 14:
                    Mesa mesa14= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa14=hacerPedidos(mesa14);
                    sacarFactura(mesa14);
                    mesa14.verPedidos();
                    break;
                case 15:
                    Mesa mesa15= new Mesa();
                    restaurante.imprimirCarta();
                    System.out.print("Que van a tomar? ");
                    mesa15=hacerPedidos(mesa15);
                    sacarFactura(mesa15);
                    mesa15.verPedidos();
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