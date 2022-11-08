package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LedgerWriter {

	private final static String fileAddress = "\\Users\\sarmar\\eclipse-workspace\\bankingSystem\\src\\file\\ledger.txt";
	private FileWriter fileWriter;
	private PrintWriter out;

	public LedgerWriter() {
		try {
			fileWriter = new FileWriter(fileAddress);
			out = new PrintWriter(fileWriter);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeToLedger(char symbol, double amount) {
		out.println(String.format("%s%s", symbol , amount));
		out.flush();
	}
}
