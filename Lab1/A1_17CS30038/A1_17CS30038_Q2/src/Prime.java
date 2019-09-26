import java.util.Scanner; 
public class Prime {
	static void findprime(int num)
	{
		boolean flag=false;
		for(int i = 2; i <= num/2; ++i)
        {

            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num);
	}
	public static void main(String args[])
	{
		System.out.println("enter the two numbers\n");
		int a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Following are the prime numbers:\n");
		for(int i =a;i<=b;i++)
		{
			findprime(i);
		}
	}

}
