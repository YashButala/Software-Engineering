
class Bank
{
	public int balance;
	public int threshold=1000;
	public Bank(int x)
	{
		balance=x;
	}
	public void withdraw (int amount) throws InsufficientBalanceException
	{
			if (balance < threshold)
				throw new InsufficientBalanceException();
			else
			{
				balance -= amount;
				System.out.println("remaining amount= "+ balance );
			}
				
		
		
}
}
public class balcheck {
	public static void main(String[] args)
	{// try for differnet bal amount....threshold is 1000
		Bank b=new Bank(100);
		try
		{
			b.withdraw(1000);
		}
		catch (InsufficientBalanceException ex)
		{
			b.balance-=100;
			System.out.println(ex) ;
			System.out.println("New balance : "+b.balance);
		
		}
	}
}

