package interfaces;

import java.util.List;

import io.LedgerEntry;

public interface IBalance {

	public void compute(List<LedgerEntry> list);
	public double getBalance();
}
