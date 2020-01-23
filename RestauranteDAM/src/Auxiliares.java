

public class Auxiliares {         //NOMBRE,                  ID, PRECIO, STOCK
         									//ENTRANTES
		static String [][] tabla_inventario = {   
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
		
		 //cambia el valor del inventario transformandolo a entero y devolviendo a su valor original
		public static String cambiainventario(int plato, int cantidad) {
			int resto=Integer.parseInt(tabla_inventario[plato][3]);
			resto=resto-cantidad;
			String pos=String.valueOf(resto);
			tabla_inventario[plato][3]=pos;
			return tabla_inventario[plato][3];
		}
		//cambia a decimal el precio y lo multiplica por la cantidad pedida para saber el pago por el plato
		public static double pagoplato(int plato, int cantidad) {
			double pago=Double.parseDouble(tabla_inventario[plato-1][2]);
			return pago=pago*cantidad;
		}
		
		
		
		public static void main(String[]args) {
			cambiainventario(3,5);
			for(int i=0;i<tabla_inventario.length;i++) {
				for(int j=0;j<tabla_inventario[0].length;j++) {
					System.out.print(tabla_inventario[i][j]+"  ");
				}
				System.out.println();
			}
		}
}
