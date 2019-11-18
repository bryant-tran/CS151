
public class Withdraw implements Runnable
{
	private BankAccount account;
	private int amount;
	
	Withdraw(BankAccount acc, int amount)
	{
		account = acc;
		this.amount = amount;
	}
	
	public void WithdrawAction()
	{
		try 
		{
			Thread.sleep(100);
		} 
		catch (InterruptedException ex)
		{	
		}
		System.out.println("Withdrawing " + amount);
		account.setBalance(account.getBalance()-amount);
		System.out.println("Balance after withdraw is " + account.getBalance());
	}
	
	public void run()
	{
		for (int i=0; i<10; i++)
		{
			WithdrawAction();
		}
	}
}
