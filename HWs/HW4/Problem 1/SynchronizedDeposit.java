
public class SynchronizedDeposit implements Runnable
{
	private BankAccount account;
	private int amount;
	
	SynchronizedDeposit(BankAccount acc, int amount)
	{
		account = acc;
		this.amount = amount;
	}
	
	public synchronized void DespositAction()
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
