import java.util.Scanner;
	public class NokiaMenuFunctions{
		public static void main(String[] args){
		Scanner input = new Scanner (System.in);

		System.out.print("""
					1 -> Phonebook
					2 -> Messages
					3 -> Chat
					4 -> Call register
					5 -> Tones
					6 -> Settings
					7 -> Call divert
					8 -> Games
					9 -> Calculator
					10 -> Reminders
		            	11 -> Clock
					12-> Profiles
					13-> SIM Services
					 """);

  int  = input.nextInt();
  switch(menu){
case 1: System.out.print("""
					1 -> Search
					2 -> Service Nos
					3 -> Add name
					4 -> Erase
					5 -> Edit
					6 -> Assign tone
					7 -> Send b'card
					8 -> Options
					""");
int options = input.nextInt();
				switch(options){
 				case 1: System.out.print("Type of view");break;
				case 2: System.out.print("Memory status"); break;
				default: System.out.print("Wrong input");break;
				} break;

case 1: System.out.print("""
					9 -> Speed dials
					10 -> Voice tags
					""");
				} break;
}
}


	
		
		