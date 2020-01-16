import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //HORA
        Hora h= new Hora();
        String hora=h.date();
        System.out.println(hora);

        Scanner s = new Scanner(System.in);
        Restaurante restaurante = new Restaurante();
        Mesa mesa = new Mesa();
        System.out.println("    BIENVENIDO A RestauranteDAM     ");
        System.out.println("1. Restaurante");
        System.out.println("2. Facturacion");
        System.out.print("Opcion: ");
        int opcion_1 = s.nextInt();

        switch(opcion_1){
            //RESTAURANTE
            case 1:
                System.out.print("Cuantos sois? ");
                int numPersonas = s.nextInt();
                restaurante.adjudicarMesa(numPersonas);
                restaurante.imprimirCarta();
                System.out.print("Que van a tomar? ");
                for (int j = 0; j<25 ; j++) {
                    for (int k = 0; k<2; k++) {
                        mesa.setPedidos(mesa, k, j);
                    }
        
                    if (mesa[k][1] > 0) {
                        System.out.println();
                    }
                }

                break;
            //FACTURACION
            case 2:
                break;
            default:
                System.out.println("ERROR. Elige una opcion valida");
        }

    }
}