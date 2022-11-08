package list;

import java.util.ArrayList;
import java.util.List;
import options.Deposit;

public class DepositList {
	
	 private List<Deposit> list;
	    
	    public DepositList() {
	    	list = new ArrayList<>();
	    }
	    
	    public void add(Deposit deposit) {
	    	list.add(deposit);
	    }
	    
	    public List<Deposit> getList() {
	        return list;
	    }

}
