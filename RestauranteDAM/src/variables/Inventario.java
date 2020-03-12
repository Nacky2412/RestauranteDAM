package variables;

public class Inventario {
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
	
	private ProductoInventario[] tabla_inv = {
		//Nombre Precio Stock
		// ENTRANTES
		new ProductoInventario("Bravas", 4, 300, 0),
		new ProductoInventario("Croquetas Variadas", 5, 300, 0),
		new ProductoInventario("Salmorejo", 5, 300, 0),
		new ProductoInventario("Ensaladilla", 5, 300, 0),
		new ProductoInventario("Boquerones en vinagre", 6, 300, 0),
		// FRIOS
		new ProductoInventario("Ensalada Mixta", 6, 300, 0),
		new ProductoInventario("Ensalada Cesar", 6, 300, 0),
		new ProductoInventario("Ensalada templada", 6, 300, 0),
		// CARNES
		new ProductoInventario("San Jacobo", 6, 300, 0),
		new ProductoInventario("Flamenquin", 7, 300, 0),
		new ProductoInventario("Carne con tomate", 7, 300, 0),
		new ProductoInventario("Presa", 12, 300, 0),
		new ProductoInventario("Secreto", 12, 300, 0),
		new ProductoInventario("Pollo plancha", 9, 300, 0),
		new ProductoInventario("Carrillada", 9, 300, 0),
		// PESCADO
		new ProductoInventario("Cazon Adobo", 7, 300, 0),
		new ProductoInventario("Calamares Fritos", 7, 300, 0),
		new ProductoInventario("Chipirones fritos", 8, 300, 0),
		new ProductoInventario("Chipirones plancha", 8, 300, 0),
		new ProductoInventario("Bacalao Bizcaina", 8, 300, 0),
		new ProductoInventario("Pez Espada", 10, 300, 0),
		// BEBIDAS
		new ProductoInventario("Agua", 1, 300, 0),
		new ProductoInventario("Refresco", 1.5, 300, 0),
		new ProductoInventario("Cerveza", 1, 300, 0),
		new ProductoInventario("Vino", 1.5, 300, 0)
	};
	
	
	public Inventario() {
		
	}
	
	public String[][] getInventario(){
		return tabla_inventario;
	}
	
	public ProductoInventario[] getProductoInventario() {
		return tabla_inv;
	}
	
	public ProductoInventario getProductoInventarioSingle(int i) {
		return tabla_inv[i];
	} 
}
