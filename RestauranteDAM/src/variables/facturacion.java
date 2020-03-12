package variables;
import java.util.List;

public class facturacion {
	List<pedido> pedidos;
	double precioTotal;
	
	public facturacion(pedido[] _pedidos){
		for(int i = 0;i < _pedidos.length;i++) {
			pedidos.add(_pedidos[i]);
			precioTotal += _pedidos[i].verPrecioTotal();
		}
	}
}
