public class TaskOne{
	public static void main(String[] args){
	
		int[] numbers = {21,8,9,7,4,8,6,31,9,84};
		//printVertical(numbers);

		//printHorizontally(numbers);

		//printOddIndex(numbers);
	
		//printEvenIndex(numbers);
		
		System.out.print(printSumNumber(numbers));
		}

		public static void printVertical(int[] num){
			for(int i = 0; i < num.length; i++){
				System.out.print(num[i] + ", ");
			}
		}

		public static void printHorizontally(int[] num){
			for(int i = 0; i < num.length; i++){
				System.out.println(num[i] + ", ");
			}
		}

		public static void printOddIndex(int[] num){
			for(int i = 0; i < num.length; i++){
				if(i % 2 == 0){
					System.out.print(num[i]);
				}
			}

		}

		public static void printEvenIndex(int[] num){
			for(int i = 0; i < num.length; i++){
				if(i % 2 != 0){
					System.out.println(num[i]);
				}
			}
		}
			
		public static int printSumNumber(int[] num){
		int total = 0;
			for(int i : num ){
			 	total += i;			
			}
		return total;
		}
		
		public static int printMinNumber()int[] num){
		int min = 100;
			for(int i = 0; i < num.length; i++){
				if (min < num){
				min == num;
				}	
			}
		
}