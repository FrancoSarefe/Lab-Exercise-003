package options;

import java.util.List;

import interfaces.IBalance;
import io.LedgerEntry;
import io.LedgerList;
import operation.Transaction;

public class Balance extends Transaction implements IBalance{

	@Override
	public void compute(List<LedgerEntry> list) {
		
		for(LedgerEntry ledgerEntry : list) {
			
			switch(ledgerEntry.getOperationSymbol()) {
			
			case '+':
				balance += ledgerEntry.getAmount();
				break;
				
			case '-':
				balance -= ledgerEntry.getAmount();
				break;
			}
			
		}
	}
	
	@Override
	public double getBalance() {
		return balance;
	}

}
