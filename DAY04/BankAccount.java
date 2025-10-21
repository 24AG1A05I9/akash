class BankAccount{
	int accountNumber;
	String holderName;
	double balance;
	BankAccount(int accNo,String name,double bal){
		accountNumber = accNo;
		holderName = name;
		balance = bal;
	}
	void deposit(double amount){
		balance += amount;
		System.out.println(amount);
	}
	void withdraw(double amount){
		if(amount <= balance){
			balance = amount - balance;
			System.out.println(amount);

		}
		else{
			System.out.println("invalid balance");
		}
	}
	void displayBalance(){
		System.out.println(holderName);
		System.out.println(balance);
	}
	public static void main(String[] args){
		BankAccount acc = new BankAccount(423,"AKASH",500);
		acc.deposit(2000);
		acc.withdraw(1000);
		acc.displayBalance();
	}
}
