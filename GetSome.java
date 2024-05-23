public class GetSome{
	public static void main(String[] args){
		System.out.println(sum(2,5));
		System.out.println(complique(10,20));
		examScoreRatings(72);
	}

	public static int sum(int num, int number){
		int total = num + number;
		return total;
	
	}

	public static int complique(int sum, int stop){
		int total  = 0;
		for(int num = sum; num <= stop; num++){
		 	total += num;
		
		}
		return total ;
	}

	public static void examScoreRatings(double score){
		if(score >= 90 ){
			System.out.println("A");
		}
		else if(score >= 80 ){
			System.out.println("B");
		}
		else if(score >=70 ){
			System.out.println("C");
		}
		else if(score >= 60 ){
			System.out.println("D");
		}
		else{
			System.out.println("F");

		}

	}
}