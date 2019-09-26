import java.util.Scanner; 
public class Pattern {
	public static void main(String[] args)
	{	
		int n,tmp=1;
		System.out.println("Enter the number of rows\n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(tmp+" ");
				tmp++;
			}
			System.out.print("\n");
		}
	}
}
