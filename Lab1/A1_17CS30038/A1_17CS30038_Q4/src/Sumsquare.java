import java.util.Scanner; 
public class Sumsquare {
	public static void main(String[] args)
	{
		System.out.println("Enter the size of array");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr; 
		arr=new int[n];
		int res=0;
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			res+=arr[i]*arr[i];
		}
		System.out.println("the sum of square of elements is "+res);
	}
}
