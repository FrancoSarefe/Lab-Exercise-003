package operation;

public abstract class Transaction {

	protected double balance;
	protected double amount;
	
	
	public void compute() {
		
	}
	
	public boolean validate() {
		return false;
	}

}
