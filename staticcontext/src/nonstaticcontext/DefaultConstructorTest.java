package nonstaticcontext;

import finance.BankAccount;

public class DefaultConstructorTest {
	
	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount(1001, 5000);
		
		BankAccount account2 = new BankAccount(1002, 6500);
		account2.withdrawMoney(500);
		account2.depositMoney(1000);
		
		account1.printAccount();
		account2.printAccount();
	}

}
