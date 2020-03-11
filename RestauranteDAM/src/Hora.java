import java.util.Calendar;

public class Hora {

	public String date() {
		Calendar calendario = Calendar.getInstance();
		int hora, minutos, segundos;
		
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		
		String hora1=hora+":"+minutos+":"+segundos;
		return hora1;
	}
		
}

