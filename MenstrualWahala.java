import java.time.LocalDate;
import java.util.Scanner;

	public class MenstrualWahala{

   	private static Scanner scanner = new Scanner(System.in);

    	public static void main(String[] args) {
      	 	 System.out.println("Welcome to Red Robot Calendar!");
       		 System.out.println("Your menstrual period Tracker");
       		 System.out.println(">".repeat(20));

        	System.out.print("When was your last cycle (YYYY-MM-DD): ");
       		LocalDate lastCycleDate = readValidDate();

       		System.out.println("Your menstrual cycle starts on the first day of a new period and runs until the day before your next period.");
       		System.out.println(">".repeat(20));

        	System.out.print("What is the average length of your period (in days): ");
       		int averageLengthOfPeriod = readValidInt();
       		System.out.println("The average menstrual cycle is 28 days long, but if yours is between 21 and 35 days long, then it’d be considered typical.");
        	System.out.println(">".repeat(20));

        	LocalDate nextCycleDate = calculateNextCycle(lastCycleDate, averageLengthOfPeriod);
        	LocalDate ovulationDate = calculateOvulationDate(lastCycleDate, averageLengthOfPeriod);
        	LocalDate safePeriodStartDate = calculateSafePeriodStartDate(lastCycleDate);
        	LocalDate safePeriodEndDate = calculateSafePeriodEndDate(ovulationDate);

       		System.out.println("");
        	System.out.println("Your next period is expected around: " + nextCycleDate);
        	System.out.println("");
        	System.out.println("Your estimated ovulation date is: " + ovulationDate);
        	System.out.println("");
        	System.out.println("Your estimated safe period is from " + safePeriodStartDate + " to " + safePeriodEndDate);
        	System.out.println("Safe days calculator helps you to find out the safe days in your menstrual cycle, that you can have sexual intercourse without the fear of getting 			pregnant. It just requires you to remember the starting date of your last period, and your longest and shortest menstrual cycle.");
  		}

  		public static LocalDate readValidDate() {
       		LocalDate date = null;
      		boolean valid = false;
        	while (!valid) {
          	try {
                String input = scanner.nextLine();
                date = LocalDate.parse(input);
                valid = true;
           	} catch (Exception e) {
                System.out.println("Invalid date format. Please enter date in YYYY-MM-DD format:");
          	}
        	}
        	return date;
    		}

   		public static int readValidInt() {
        	int value = 0;
        	boolean valid = false;
        	while (!valid) {
            	try {
                value = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                valid = true;
           	} catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer:");
                scanner.nextLine(); // Consume invalid input
           	}
        	}
        	return value;
   		}

    		public static LocalDate calculateNextCycle(LocalDate lastCycleDate, int averageLengthOfPeriod) {
        	return lastCycleDate.plusDays(averageLengthOfPeriod);
    		}

    		public static LocalDate calculateOvulationDate(LocalDate lastCycleDate, int averageLengthOfPeriod) {
        	return lastCycleDate.plusDays(averageLengthOfPeriod / 2);
    		}

    		public static LocalDate calculateSafePeriodStartDate(LocalDate lastCycleDate) {
        	return lastCycleDate.plusDays(7);
    		}

    		public static LocalDate calculateSafePeriodEndDate(LocalDate ovulationDate) {
        	return ovulationDate.minusDays(10);
   		 }
}
