
public class ExceptionHandlingExample {
	public static void main(String args[])
	{
		int divisor=0;
		int divident=11;
		try
		{
			int result = divident/divisor;
			System.out.println("The result is : "+ result);
		
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Division by zero!");
		}
		catch(Exception e)
		{
			System.out.println("An exception occured!");
		}
		finally
		{
			System.out.println("We're done!");
		}
	}
}
