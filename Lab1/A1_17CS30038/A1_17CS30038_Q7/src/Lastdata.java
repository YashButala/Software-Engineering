import java.util.Scanner; 
class Data{
	int data1,data2;
	public Data(int a,int b)
	{
		this.data1=a;
		this.data2=b;
	}
	public void printdata()
	{
		System.out.println("stored data "+data1+" "+data2);
	}	
}
class NewData extends Data
{
	int data3,data4;
	public NewData(int a,int b,int c,int d)
	{
		super(a,b);
		this.data3=c;
		this.data4=d;
	}
	public void printdata()
	{
		System.out.println("stored data "+data1+" "+data2+" "+data3+" "+data4);
	}
}
public class Lastdata {
	public static void main(String[] args)
	{
		int a,s,d,f;
		System.out.println("enter data1,data2,data3,data4 in order");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		s=sc.nextInt();
		d=sc.nextInt();
		f=sc.nextInt();
		Data A= new NewData(a,s,d,f);
		A.printdata();
	}

}
