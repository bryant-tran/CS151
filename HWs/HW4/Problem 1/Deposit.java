
public class Deposit implements Runnable
{
	private BankAccount account;
	private int amount;
	
	Deposit(BankAccount acc, int amount)
	{
		account = acc;
		this.amount = amount;
	}
	
	public void DespositAction()
	{
		try 
		{
			Thread.sleep(100);
		} 
		catch (InterruptedException ex)
		{	
		}
		System.out.println("Depositing " + amount);
		account.setBalance(account.getBalance() + amount);
		System.out.println("Balance after deposit is " + account.getBalance());
	}
	
	public void run()
	{
		for (int i=0; i<10; i++)
		{
			DespositAction();
		}
	}
}
