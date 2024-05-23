import java.time.LocalDate;

	public class DayOfWeek{
	public static void main(String[] args){

	LocalDate today = LocalDate.now();

	LocalDate futureDate = today.plusDays(100);

	DayOfWeek dayOfWeek = future.getDayOfWeek();


	System.out.println("Today is: " + today.getDayOfWeek());

	System.out.println("After 100 days, it will be: " + dayOfWeek);


	}
	}