
import java.util.Scanner;
public class Statements{

	public static void main(String[] args){
		
		String prompt = """
		Hi, Welcome

		Press
		1 -> For English
		2 -> For Yoruba
		3 -> For Hausa
		""";

		String Prompt2 = """
	
		Press
		1 -> To make a reservation
		2 -> To request for the spa menu
		""";




		System.out.println(prompt);
		Scanner keyboardInput = new Scanner(System.in);
		int userInput = keyboardInput.nextInt();


		switch(userInput){
			case 1: {
				System.out.println ("English");
				break;
			}

			case 2: {
				System.out.println ("Yoruba");
				break;
			}

			case 3: {
				System.out.println ("Hausa");
				break;
			}
		
		default-> System.out.println("for further enquires please call");

		}


		String Prompt2 = """
	
		Press
		1 -> To make a reservation
		2 -> To request for the spa menu
		""";



		System.out.println(englishprompt);
		int userInput1 = keyboardInput.nextInt();


		switch(userInput1){
		case 1 -> System.out.println("To make a reservation");

		case 2 -> System.out.println("To request for the spa menu");

		
		
		default-> System.out.println("for further enquiries  please call ");

		}

		String Prompt3 = """
	
		Press
		1 -> To book for a home services
		2 -> To book for an impromptu walk in
		""";


		System.out.println(prompt3);
	      int userInput2 = keyboardInput.nextInt();


		switch(userInput2){
		case 1 -> System.out.println("To book for a home services");

		case 2 -> System.out.println("To book for an impromptu walk in");

		
		
		default-> System.out.println("for further enquires");
		}

           }
		}