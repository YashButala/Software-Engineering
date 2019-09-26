import java.util.Scanner; 
public class AccountAccess {
	public static void main(String[] args)
	{
		Account A=new Account("Yash",3434,9999);
		A.Withdraw();
		A.Get_Balance();
		Account B=new Account("Aditya",3434,"vnufidfv","Current",9999);
		B.Deposit();
		B.Get_Balance();
	}
}
