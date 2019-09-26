import java.util.Scanner;


public class trycatch {
	public static void main(String args[])
	{
		try 
		{
			System.out.println("Enter the array size");
			Scanner sc=new Scanner(System.in);
			int a;
			a=sc.nextInt();
			int[] arr=new int[a];
			System.out.println("Enter the array elements");
			for(int i=0;i<a;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("The array elements are:");
			for(int i=0;i<a;i++)
			{
				System.out.println(arr[i]);
			}			
		} 
		
		catch (NegativeArraySizeException ex) 
		{
			System.out.println("Can't create array of negative size");
		}
	}

}
