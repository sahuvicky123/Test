package FirstTest;

import java.util.ArrayList;

public class Bank{
	private long accountno;
	private String name;
	private double amount;
	private static ArrayList<Bank>bank=new ArrayList<Bank>();
	
	public Bank(long accountno,String name,double amount)
	{
		this.accountno=accountno;
		this.name=name;
		this.amount=amount;
	}
	public static void addAccount(Bank account)
	{
		bank.add(account);
	}
	public static void removeAccount(Bank account)
	{
		bank.remove(account);
	}
	public void deposit(int dep)
	{
		amount=amount+dep;
	}
	public void withdraw(int wid)
	{
		amount=amount-wid;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank acc1=new Bank(1234,"vicky",2000);
		Bank acc2=new Bank(4321, "aman", 3000);
		Bank acc3=new Bank(3452,"sunil",2900);
		Bank.addAccount(acc1);
		Bank.addAccount(acc2);
		Bank.addAccount(acc3);
		for(Bank acc:bank)
		{
			System.out.println("Account:"+acc.accountno+" Name:"+acc.name+" Balance:"+acc.amount);
		}
		acc1.deposit(1200);
		acc2.withdraw(1300);
		acc3.deposit(540);
		for(Bank acc:bank)
		{
			System.out.println("Account:"+acc.accountno+" Name:"+acc.name+" Balance:"+acc.amount);
		}

	}

}
