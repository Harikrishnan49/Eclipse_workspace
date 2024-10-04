package org.google;

public class Basic {
	int accountnumber = 598276928;
	String name = "Hari";
	long balance = 2452345l;

	public void getBalance() {
		System.out.println("The balance of my account is " + balance);
	}

	public void getHolderName() {
		System.out.println("The account holder name is "+ name);
	}
	public void getNumber() {
		System.out.println("The account number is "+ accountnumber);
	}
	public static void main(String[] args) {
		Basic basic = new Basic();
		basic.getBalance();
		basic.getHolderName();
		basic.getNumber();
	}
}
