public class RunningRunnable implements Runnable{
	public void run()
	{
		try {
			System.out.println("The name of this thread is "+Thread.currentThread().getName());
        	System.out.println("The STATE of this thread is "+Thread.currentThread().getState());
        	System.out.println("The priority of this thread is "+Thread.currentThread().getPriority());
        		for(int i=1;i<=10;i++)
        		{
        			System.out.println(i);
        			Thread.currentThread();
        			Thread.sleep(1000);
        		}
        	
            } 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}
     	
		
	}
	public static void main(String args[]){
		RunningRunnable rtest=new RunningRunnable();
		
		Thread T1= new Thread(rtest);
		T1.setPriority(10);
		
		Thread T2= new Thread(rtest);
		T2.setPriority(1);
		
		Thread T3= new Thread(rtest);
		T3.setPriority(5);
		
		Thread T4= new Thread(rtest);
		T4.setPriority(3);
		
		T1.start();
		T2.start();
		T3.start();
		T4.start();
		
	}
	

}
