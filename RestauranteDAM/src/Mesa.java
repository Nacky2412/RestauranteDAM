public class Mesa {

    // atributos
    private int[][] mesa = {
            // MESA
            // ID, CANT
            // ENTRANTES
            { 1, 0 }, 
            { 2, 0 }, 
            { 3, 0 }, 
            { 4, 0 }, 
            { 5, 0 },
            // FRIO
            { 6, 0 }, 
            { 7, 0 }, 
            { 8, 0 },
            // CARNES
            { 9, 0 }, 
            { 10, 0 }, 
            { 11, 0 }, 
            { 12, 0 }, 
            { 13, 0 },
            { 14, 0 }, 
            { 15, 0 },
            // PESCADO
            { 16, 0 }, 
            { 17, 0 }, 
            { 18, 0 }, 
            { 19, 0 }, 
            { 20, 0 },
             { 21, 0 },
            // BEBIDAS
            { 22, 0 },
             { 23, 0 }, 
             { 24, 0 }, 
             { 25, 0 }, 
        };

    // Constructor
    public Mesa() {
    }

    // Metodos
    public void limpiarMesa() {// limpiar todos los pedidos (poner a 0)
        for (int i = 0; i < mesa.length; i++) {
            mesa[i][1] = 0;
        }
    }

    public void setPedidos(int id, int cantidad) {
        for (int i = 0; i < mesa.length; i++) {
            if (mesa [i][0]==id) {
                mesa[i][1]=cantidad;
            }
        }    
    }
    public int getPedidos(int[][] mesa, int fila, int columna) {// sacar los pedidos
        return mesa[fila][columna];
    }

}