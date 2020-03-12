package logica;

import java.util.Scanner;

public class Carta {
    static Scanner s;
    static String[][] tabla_inventario = {
                                            // NOMBRE,                  ID, PRECIO, STOCK
                                            // ENTRANTES
                                            { "Bravas",                 "1", "4", "300" }, 
                                            { "Croquetas variadas",     "2", "5", "300" }, 
                                            { "Salmorejo",              "3", "5", "300" },
                                            { "Ensaladilla",            "4", "5", "300" }, 
                                            { "Boquerones en vinagre",  "5", "6", "300" },
                                            // FRIOS
                                            { "Enslada Mixta",          "6", "6", "300" }, 
                                            { "Ensalada Cesar",         "7", "6", "300" },
                                            { "Ensalada Templada",      "8", "6", "300" },
                                            // CARNES
                                            { "San Jacobo",             "9", "6", "300" }, 
                                            { "Flamenquin",             "10", "7", "300" },
                                            { "Carne con tomate",       "11", "7", "300" }, 
                                            { "Presa",                  "12", "12", "300" }, 
                                            { "Secreto",                "13", "12", "300" },
                                            { "Pollo plancha",          "14", "9", "300" }, 
                                            { "Carrillada",             "15", "9", "300" },
                                            // PESCADO
                                            { "Cazon adobo",            "16", "7", "300" }, 
                                            { "Calamares fritos",       "17", "7", "300" },
                                            { "Chipirones fritos",      "18", "8", "300" }, 
                                            { "Chipirones plancha",     "19", "8", "300" },
                                            { "Bacalao Vizcaina",       "20", "8", "300" }, 
                                            { "Pez espada",             "21", "10", "300" },
                                            // BEBIDAS
                                            { "Agua",                   "22", "1", "300" }, 
                                            { "Refrescos",              "23", "1.5", "300" }, 
                                            { "Cerveza",                "24", "1", "300" },
                                            { "Vino",                   "25", "1.5", "300" },

                                    };
    public Carta(){
        
    }
    public String devolverNombrePlato(String codigo) {
        String nombre="";
        boolean salir=false;
        for (int i = 0; i < tabla_inventario.length&&!salir; i++) {
            if (tabla_inventario[i][1].equals(codigo)) {
                nombre=tabla_inventario[i][0];
                salir=true;
            }
        }
        return nombre;
    }
    public int devolverCodigoPlato(String plato) {
        int codigo=0;
        boolean salir=false;
        for (int i = 0; i < tabla_inventario.length&&!salir; i++) {
            if (tabla_inventario[i][0].equals(plato)) {
                codigo=Integer.parseInt(tabla_inventario[i][1]);
                salir=true;
            }
        }
        return codigo;
    }
    public double devolverPrecioPlato(String codigo) {
        double precio=0;
        boolean salir=false;
        for (int i = 0; i < tabla_inventario.length&&!salir; i++) {
            if (tabla_inventario[i][1].equals(codigo)) {
                precio=Double.parseDouble(tabla_inventario[i][2]);
                salir=true;
            }
        }
        return precio;
    }
    /*
    public static Mesa hacerPedidos(Mesa mesa){
        boolean salir = false;
        System.out.println("Introduce la ID y la CANT del producto (0 para salir) ");
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
    */
    
    /*
    public void verMesas() {
        s=new Scanner(System.in);
    
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
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa1=hacerPedidos(mesa1);
                sacarFactura(mesa1);
                mesa1.verPedidos();
                break;
            case 2:
                Mesa mesa2= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa2=hacerPedidos(mesa2);
                sacarFactura(mesa2);
                mesa2.verPedidos();
                break;
            case 3:
                Mesa mesa3= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa3=hacerPedidos(mesa3);
                sacarFactura(mesa3);
                mesa3.verPedidos();
                break;
            case 4:
                Mesa mesa4= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa4=hacerPedidos(mesa4);
                sacarFactura(mesa4);
                mesa4.verPedidos();
                break;
            case 5:
                Mesa mesa5= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa5=hacerPedidos(mesa5);
                sacarFactura(mesa5);
                mesa5.verPedidos();
                break;
            case 6:
                Mesa mesa6= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa6=hacerPedidos(mesa6);
                sacarFactura(mesa6);
                mesa6.verPedidos();
                break;
            case 7:
                Mesa mesa7= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa7=hacerPedidos(mesa7);
                sacarFactura(mesa7);
                mesa7.verPedidos();
                break;
            case 8:
                Mesa mesa8= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa8=hacerPedidos(mesa8);
                sacarFactura(mesa8);
                mesa8.verPedidos();
                break;
            case 9:
                Mesa mesa9= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa9=hacerPedidos(mesa9);
                sacarFactura(mesa9);
                mesa9.verPedidos();
                break;
            case 10:
                Mesa mesa10= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa10=hacerPedidos(mesa10);
                sacarFactura(mesa10);
                mesa10.verPedidos();
                break;
            case 11:
                Mesa mesa11= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa11=hacerPedidos(mesa11);
                sacarFactura(mesa11);
                mesa11.verPedidos();
                break;
            case 12:
                Mesa mesa12= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa12=hacerPedidos(mesa12);
                sacarFactura(mesa12);
                mesa12.verPedidos();
                break;
            case 13:
                Mesa mesa13= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa13=hacerPedidos(mesa13);
                sacarFactura(mesa13);
                mesa13.verPedidos();
                break;
            case 14:
                Mesa mesa14= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa14=hacerPedidos(mesa14);
                sacarFactura(mesa14);
                mesa14.verPedidos();
                break;
            case 15:
                Mesa mesa15= new Mesa();
                imprimirCarta();
                System.out.print("Que van a tomar? ");
                mesa15=hacerPedidos(mesa15);
                sacarFactura(mesa15);
                mesa15.verPedidos();
                break;
            }
    }
    */

    public static void imprimirCarta() {
        System.out.println("        MENU       ");
        for (int i = 0; i < tabla_inventario.length; i++) {
                System.out.print(tabla_inventario[i][1]+"   "+tabla_inventario[i][0] + "    "+tabla_inventario[i][2]+" euros");
            System.out.println();
        }
    }

}
