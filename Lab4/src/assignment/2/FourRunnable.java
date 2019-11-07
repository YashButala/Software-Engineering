public class FourRunnable implements Runnable{
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
		FourRunnable rtest=new FourRunnable();
		
		Thread T1= new Thread(rtest);
		T1.start();
		
		Thread T2= new Thread(rtest);
		T2.start();

		Thread T3= new Thread(rtest);
		T3.start();

		Thread T4= new Thread(rtest);
		T4.start();

		
	}
	

}
