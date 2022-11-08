package io;

import java.util.ArrayList;
import java.util.List;

public class LedgerList {
	
    private List<LedgerEntry> ledgerEntries;
    
    public LedgerList() {
        ledgerEntries = new ArrayList<>();
    }
    
    public void add(LedgerEntry ledgerEntry) {
        ledgerEntries.add(ledgerEntry);
    }
    
    public List<LedgerEntry> getList() {
        return ledgerEntries;
    }
    
}
