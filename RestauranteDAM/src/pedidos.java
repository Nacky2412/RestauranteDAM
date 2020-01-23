import  java.util.Scanner;

public class pedidos {                     
    static String [][] tabla_inventario = {
                                        //NOMBRE,                  ID, PRECIO, STOCK
                                        //ENTRANTES  
                                        {"Bravas",                  "1","4","300"},
                                        {"Croquetas variadas",      "2","5","300"},
                                        {"Salmorejo",               "3","5","300"},
                                        {"Ensaladilla",             "4","5","300"},
                                        {"Boquerones en vinagre",   "5","6","300"},
                                        //FRIOS
                                        {"Enslada Mixta",           "6","6","300"},
                                        {"Ensalada Cesar",          "7","6","300"},
                                        {"Ensalada Templada",       "8","6","300"},
                                        //CARNES
                                        {"San Jacobo",              "9","6","300"},
                                        {"Flamenquin",              "10","7","300"},
                                        {"Carne con tomate",        "11","7","300"},
                                        {"Presa",                   "12","12","300"},
                                        {"Secreto",                 "13","12","300"},
                                        {"Pollo plancha",           "14","9","300"},
                                        {"Carrillada",              "15","9","300"},
                                        //PESCADO
                                        {"Cazon adobo",             "16","7","300"},
                                        {"Calamares fritos",        "17","7","300"},
                                        {"Chipirones fritos",       "18","8","300"},
                                        {"Chipirones plancha",      "19","8","300"},
                                        {"Bacalao Vizcaina",        "20","8","300"},
                                        {"Pez espada",              "21","10","300"},
                                        //BEBIDAS
                                        {"Agua",                    "22","1","300"},
                                        {"Refrescos",               "23","1.5","300"},
                                        {"Cerveza",                 "24","1","300"},
                                        {"Vino",                    "25","1.5","300"},

                                        };
    static String [][][] mesa = {
        {    //MESA1
            //ID, PRECIO, CANT
            //ENTRANTES  
            {"1","0"},
            {"2","0"},
            {"3","0"},
            {"4","0"},
            {"5","0"},
            //FRIOS
            {"6","0"},
            {"7","0"},
            {"8","0"},
            //CARNES
            {"9","0"},
            {"10","0"},
            {"11","0"},
            {"12","0"},
            {"13","0"},
            {"14","0"},
            {"15","0"},
            //PESCADO
            {"16","0"},
            {"17","0"},
            {"18","0"},
            {"19","0"},
            {"20","0"},
            {"21","0"},
            //BEBIDAS
            {"22","0"},
            {"23","0"},
            {"24","0"},
            {"25","0"},
            }
    };
    public static void imprimirCarta() {
        System.out.println("        MENU       ");
        for(int i=0; i<tabla_inventario.length; i++){
            for(int j=0;j<tabla_inventario[0].length-1; j++){
                System.out.print(tabla_inventario[i][j]+"    ");
                
            }
            System.out.println();
        }
    }
    public  static  void  main(String[]  args)  {
        imprimirCarta();
        System.out.print("¿Que va a tomar?");
    }

}
