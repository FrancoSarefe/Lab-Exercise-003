package options;

import interfaces.IDeposit;
import operation.Transaction;

public class Deposit extends Transaction implements IDeposit{
	
	public Deposit(double amount){

		this.amount = amount;
	}
	
	@Override
	public boolean validate(){
		
		if(this.amount > 0) {
			return true;
		}
		
		return false;
	}
}
