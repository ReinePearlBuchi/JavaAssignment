public class SevenSegment {

	public static void main(String[] args){

		
			
	}


	private static final int[][] segment = new int[5][4];
	
	public static void sideA(){
		segment[0][0] = 1;
		segment[0][1] = 1;
		segment[0][2] = 1;
		segment[0][3] = 1;

	}

	public static void sideB(){
		segment[0][3] = 1;
		segment[1][3] = 1;
		segment[2][3] = 1;

			
	}

	public static void sideC(){
		segment[2][3] = 1;
		segment[3][3] = 1;
		segment[4][3] = 1;
	}
	
	public static void sideD(){
		segment[4][0] = 1;
		segment[4][1] = 1;
		segment[4][2] = 1;
		segment[4][3] = 1;		

	}

	public static void sideE(){
		segment[2][0] = 1;
		segment[3][0] = 1;
		segment[4][0] = 1;

	}
	
	public static void sideF(){

		segment[0][0] = 1;
		segment[1][0] = 1;
		segment[2][0] = 1;
	}
	
	public static void sideG(){

		segment[2][0] = 1;
		segment[2][1] = 1;
		segment[2][2] = 1;
		segment[2][3] = 1;
	}

	public static void displaySegment(){\
		
		for(int[] i : segment){
				
			for(int j : i){
				System.out.print("#");
			}
		System.out.print(" ");
		}


	}


}