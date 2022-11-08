package io;

public class LedgerEntry {
	
    private char operationSymbol;
    private double amount;
    
    public LedgerEntry(char operationSymbol, double amount) {
      
        this.operationSymbol = operationSymbol;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public char getOperationSymbol() {
        return operationSymbol;
    }
  
}
