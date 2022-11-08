package options;

import interfaces.IWithdrawl;
import operation.Transaction;

public class Withdrawl extends Transaction implements IWithdrawl {

	public Withdrawl(double amount, double balance) {
		this.amount = amount;
		this.balance = balance;

	}
	@Override
	public boolean validate() {

		if (((this.amount % 1) == 0) && (this.amount < 10_000) && ((this.amount % 100) == 0)
				&& (this.amount < this.balance) && (this.amount != 0)) {

			return true;

		} else if (this.amount >= 10_000) {

			System.out.println("Maximum amount for each transaction is 10_000");

		} else if ((this.amount % 1) != 0) {

			System.out.println("Amount should not contain decimal value");

		} else if ((this.amount % 100) != 0) {

			System.out.println("Amount should be divisible by 100");

		} else if (this.amount > this.balance) {

			System.out.println("Amount should not be  greater than current balance");
			
		} else if (this.amount <= 0){

			System.out.println("Withdrawl amount should be greater than 0");
		}

		return false;
	}

}
