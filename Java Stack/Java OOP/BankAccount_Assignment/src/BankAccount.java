import java.util.Random;

public class BankAccount {
	private String account_number;
	private double checking_balance;
	private double saving_balance;
	static int number_of_accounts;
	static int total_amount;


public BankAccount() {
	String num=acc_number();
	this.account_number= num;
	number_of_accounts++;
	
	}
public String get_account_number() {
	return this.account_number;
	
}

private String acc_number() {
	int random_int = (int)Math.floor(Math.random()*(999999999-100000000+1)+1000000000);
    return  String.valueOf(random_int) ;
    	
	
}
public double get_checking_balance() {
	return this.checking_balance;
}
public double get_saving_balance() {
	return this.saving_balance;
}
public void deposit(double money,char type ) {
	if(type=='c') {
		this.checking_balance+=money;
		total_amount+=money;
		System.out.println(" done add to checking_balance  ");
	}
		else if(type=='s') {
		this.saving_balance+=money;
		total_amount+=money;
		System.out.println(" done add to saving_balance  ");
		}
		else {System.out.println("please check your type ");}
	}
public void withdraw(double amount,char type) {
	if(total_amount>amount) {
		System.out.println("insufficient funds");
	}
		else {
			if(type=='c') {
				this.checking_balance-=amount;
				total_amount+=amount;
				System.out.println(" done add to checking_balance  ");
			}
				else if(type=='s') {
				this.saving_balance-=amount;
				total_amount-=amount;
				System.out.println(" done add to saving_balance  ");
				}
				else {System.out.println("please check your type ");}
			
		}
		
	}
{
}
public void dispaly_total() {
	System.out.println("Total:"+total_amount +" checking_balance :"+this.checking_balance +" saving_balance:"+this.saving_balance);
}
	
	
} 



