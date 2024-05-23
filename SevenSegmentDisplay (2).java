import java.util.Scanner;

public class SevenSegmentDisplay{
	public static void main(String... args){	
	Scanner input = new Scanner(System.in);

        System.out.print("Enter binary Number ");
        int value = input.nextInt();

        String valToString = String.valueOf(value);
        inputValue(valToString);
        display();
    }

private static final int[][] segment = new int[5][4];

    public static void sideA() {
        segment[0][0] = 1;
        segment[0][1] = 1;
        segment[0][2] = 1;
        segment[0][3] = 1;


    }
    public static void sideB() {
        segment[0][3] = 1;
        segment[1][3] = 1;
        segment[2][3] = 1;

    }

    public static void sideC() {
        segment[2][3] = 1;
        segment[3][3] = 1;
        segment[4][3] = 1;
    }

    public static void sideD() {
        segment[4][0] = 1;
        segment[4][1] = 1;
        segment[4][2] = 1;
        segment[4][3] = 1;
    }

    public static void sideE() {
        segment[2][0] = 1;
        segment[3][0] = 1;
        segment[4][0] = 1;
    }

    public static void sideF() {
        segment[0][0] = 1;
        segment[1][0] = 1;
        segment[2][0] = 1;
    }

    public static void sideG() {
        segment[2][0] = 1;
        segment[2][1] = 1;
        segment[2][2] = 1;
        segment[2][3] = 1;
    }

    public static void display(){
        for (int[] i : segment){
            for (int j : i){
                if (j == 1){
                    System.out.print("# ");
                } else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

  static void inputValue(String value)  {
        if (value.length() > 9){
            value = value.substring(0, 9);
        }

        

        for (int i = 0; i < value.length(); i++){
            if (value.charAt(i) == '1' && value.charAt(7) == '1'){
                switch (i){
                    case 0-> sideA();
                    case 1-> sideB();
                    case 2-> sideC();
                    case 3-> sideD();
                    case 4-> sideE();
                    case 5-> sideF();
                    case 6-> sideG();
                }
            }
        }
    }
       
    
}