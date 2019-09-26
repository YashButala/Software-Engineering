import java.util.Scanner; 
class Box {
	void Area()
	{
		
	}
}
class Rectangle extends Box
{
	 void Area()
	{
		int l,b;
		System.out.println("enter the length and breadth\n");
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		b=sc.nextInt();
		System.out.println("the area of rectangle: "+(l*b));
	}
}
class Rhombus extends Rectangle
{
	 void Area()
		{
			int l,b;
			System.out.println("enter the diagonal lengths\n");
			Scanner sc=new Scanner(System.in);
			l=sc.nextInt();
			b=sc.nextInt();
			System.out.println("the area of rhombus: "+(float)(l*b)/2.0);
		}
}
class Square extends Rectangle
{
	 void Area()
		{
			int l;
			System.out.println("enter the side of square\n");
			Scanner sc=new Scanner(System.in);
			l=sc.nextInt();
			System.out.println("the area of square: "+(l*l));
		}
}
public class Testbox{
	public static void main(String[] args)
	{
		Box a;
		a=new Square();
		a.Area();
		Box b;
		b=new Rectangle();
		b.Area();
		Box c;
		c=new Rhombus();
		c.Area();
	}

}
