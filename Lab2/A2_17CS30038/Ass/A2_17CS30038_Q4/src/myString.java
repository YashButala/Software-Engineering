import java.util.Scanner;
public class myString {
	public static void main(String args[])
	{
		String S= new String("Yash Butala");
		System.out.println(S.length());
		int count=0;
		for(int i=0;i<S.length();i++)
		{
			if(S.charAt(i)=='a')
				count++;
				
		}
		if(count>0)
		{
			System.out.println("The positions are:");
			for(int i=0;i<S.length();i++)
			{
				if(S.charAt(i)=='a')
					System.out.print((i+1)+" ");
					
			}
			System.out.println("\nTotal Count"+count);
		}
		else
		{
			System.out.println("No instance of letter a found");
		}
		
	}
}
