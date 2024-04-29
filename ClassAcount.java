public class ClassAcount{
	private String name;
	private double balance;	

	public ClassAcount(String name, double balance){
		this.name = name;

		if(balance > 0.0){
			this.balance = balance;
		}
	
	}


	public void deposit(double depositAmount) {
		if(depositAmount > 0.0){
			balance = balance + depositAmount;
		}

	}
}