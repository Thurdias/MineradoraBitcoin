import java.util.Calendar;

public class Principal {
	public static void main(String[] args) {
		Calendar objCalendar = Calendar.getInstance();
		System.out.println(objCalendar.get(Calendar.HOUR_OF_DAY) + ":" +
						   objCalendar.get(Calendar.MINUTE) + ":" +
						   objCalendar.get(Calendar.SECOND) + ":" +
						   objCalendar.get(Calendar.MILLISECOND)); 
						   
		new Mineradora("1000000000","2000000000").start();
		new Mineradora("3000000000","4000000000").start();
		new Mineradora("5000000000","6000000000").start();
		new Mineradora("7000000000","8000000000").start();
		new Mineradora("9000000000","10000000000").start();
		new Mineradora("11000000000","12000000000").start();
		new Mineradora("13000000000","14000000000").start();
		new Mineradora("15000000000","16000000000").start();
		new Mineradora("17000000000","18000000000").start();
	}
}
