import java.util.Calendar;
import java.util.GregorianCalendar;



public class Hora {

	public String date() {
		Calendar calendario = Calendar.getInstance();
		Calendar calendario1 = new GregorianCalendar();
		int hora, minutos, segundos;
		
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		
		String hora1=hora+":"+minutos+":"+segundos;
		return hora1;
		
	}
		
}

