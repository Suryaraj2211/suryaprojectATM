package Atm;

public class ATM {

	private double balance;
	private double depositAmount;
	private double withdrawAmount;
	
	//default constructor
	public ATM() {
		
	}
	//getter setter
	public double getBalance(){
		return balance;
	}
	public void setBalance(double newBalance) {
	    balance = newBalance;
	}

}
