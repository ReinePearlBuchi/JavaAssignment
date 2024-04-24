import java.util.Scanner;
	public class SwitchCase{
		public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("""
					1 -> English
						1 -> English Slangs
						2 -> British English
						3 -> American English
					2 -> Yoruba
					3 -> Igbo
					 """);
  int language = input.nextInt();
  switch(language){
case 1: System.out.print("""
					1 -> English Slangs
					2 -> British English
					3 -> American English
					 """);
				int englishType = input.nextInt();
				switch(englishType){
 				case 1: System.out.print("Welcome to English Slangs");break;
				case 2: System.out.print("Welcome to British English"); break;
				case 3: System.out.print("Welcome to American English"); break;
				default: System.out.print("Wrong input");break;
				} break;
case 2: System.out.print(" Welcome to Yoruba"); break;
case 3: System.out.print(" Welcome to Igbo"); break;
default: System.out.print("Wrong input");

}



}
}

