
public class testbank {
	public static void main(String[] args) {
		BankAccount b1= new BankAccount();
		BankAccount b2= new BankAccount();
		
		System.out.println(b1.get_account_number());
		b1.deposit(10000, 's');//s > saving_balance
		b1.dispaly_total();
		b1.deposit(2344, 'c');//c > checking_balance
		b1.dispaly_total();
		b2.withdraw(1000, 'c');
		
	}

}
