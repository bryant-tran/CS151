
public class hw4
{
	public static void main(String[] args) throws InterruptedException 
	{
		BankAccount account = new BankAccount(100);
		
		//Not Synchronized
//		Withdraw withdrawRunnable = new Withdraw(account, 100);
//		Deposit depositRunnable = new Deposit(account, 100);
//		
//		Thread one = new Thread(withdrawRunnable);
//		Thread two = new Thread(depositRunnable);
//		System.out.println("This is the one that might get courrupted:");
//		one.start();
//		two.start();
		
		//Synchronized
		SynchronizedWithdraw synchronizedWithdrawRun = new SynchronizedWithdraw(account, 100);
		SynchronizedDeposit synchronizedDepositRun = new SynchronizedDeposit(account, 100);
		
		Thread sync1 = new Thread(synchronizedWithdrawRun);
		Thread sync2 = new Thread(synchronizedDepositRun);
		System.out.println("This is the one that is synchronized");
		sync1.start();
		sync2.start();
		sync1.join();
		sync2.join();
	}
}
