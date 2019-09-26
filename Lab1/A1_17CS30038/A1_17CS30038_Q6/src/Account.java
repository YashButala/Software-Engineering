import java.util.Scanner; 
public class Account {
	private String name,type,address;
	private int bal,account_number;
	public Account(String name ,int account_number,int bal)
	{
		this.name=name;
		this.account_number= account_number;
		this.bal=bal;
		this.address="dffdvsdf";
		this.type="Savings";
	}
	public Account(String name, int account_number,String address,String type,int bal)
	{
		this.name=name;
		this.account_number= account_number;
		this.bal=bal;
		this.address=address;
		this.type=type;
	}
	public void Deposit()
	{
		{
			int l;
			System.out.println("enter the amount to deposit\n");
			Scanner sc=new Scanner(System.in);
			l=sc.nextInt();
			this.bal+=l;
			System.out.println("the amount deposited: "+l);
		}
	}
	public void Withdraw()
	{
		{
			int l;
			System.out.println("enter the amount to withdraw\n");
			Scanner sc=new Scanner(System.in);
			l=sc.nextInt();
			if(this.bal<l)
			{
				System.out.println("low balance!");
			}
			else
			{
				this.bal-=l;
				System.out.println("the amount withdrawn: "+l);
			}
		}
	}
	public void Get_Balance()
	{
		{
			System.out.println("the account holder is: "+this.bal);
			System.out.println("the account number is: "+this.bal);
			System.out.println("the current balance is: "+this.bal);
			System.out.println("Thank You For Banking With Us");
		}
	}

}
