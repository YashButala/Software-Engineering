import java.util.ArrayList;


public class arrayList {
	public static void main(String args[])
	{
		ArrayList < Integer > a = new ArrayList<Integer>();
		for(int i=1;i<=10;i++)
		{
			a.add(i*i);
			
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("The length of arrayList is: "+a.size());
		a.clear();
		if(a.isEmpty())
		{
			System.out.println("The arrayList is empty");
		}
		else
		{
			System.out.println("The arrayList is not empty");
		}
	}
}
