import java.util.Date;
public class exercise09_07 {
	public static void main(String[] args) {
		int id = 1122;
		double balance = 20000;
		double annualInterestRate = .045;
		
		Account account1 = new Account(id, balance, annualInterestRate);
		double amount = 2500;
		account1.withdraw(amount);
		amount = 3000;
		account1.deposit(amount);
		System.out.printf("Balance: %2.2f \nMonthly Interest: %2.2f \nDate Created: %5s", account1.getBalance(), account1.getMonthlyInterest(), account1.getDateCreated());
	}
	
}
class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	Account(){
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	Account(int newid, double newbalance, double newAIR){
		id = newid;
		balance = newbalance;
		annualInterestRate = newAIR;
		dateCreated = new Date();
	}
	
	int getid() {
		return id;
	}
	
	void setid(int newid) {
		id = newid;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance(double  newbalance) {
		balance = newbalance;
	}
	
	double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	void setAnnualInterestRate(double newAIR) {
		annualInterestRate = newAIR;
	}
	
	Date getDateCreated() {
		return dateCreated;
	}
	
	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}
	
	void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}
	
	void deposit(double amount) {
		setBalance(getBalance() + amount);
	}
}


