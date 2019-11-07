
public class FourThread extends Thread{
	public void run()
	{
		try {
          	System.out.println("The name of this thread is "+Thread.currentThread().getName());
        	System.out.println("The STATE of this thread is "+Thread.currentThread().getState());
        	System.out.println("The priority of this thread is "+Thread.currentThread().getPriority());
        		for(int i=1;i<=10;i++)
        		{
        			System.out.println(i);
        			FourThread.currentThread();
        			Thread.sleep(1000);
        		}
        	
            } 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}
     	
		
	}
	public static void main(String args[]){
		FourThread T1= new FourThread();
		T1.start();
		
		FourThread T2= new FourThread();
		T2.start();

		FourThread T3= new FourThread();
		T3.start();

		FourThread T4= new FourThread();
		T4.start();

		
	}
	

}
