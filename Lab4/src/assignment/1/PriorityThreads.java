public class PriorityThreads extends Thread{
	public void run()
	{
		try {
            	System.out.println("The name of this thread is "+PriorityThreads.currentThread().getName());
            	System.out.println("The STATE of this thread is "+PriorityThreads.currentThread().getState());
            	System.out.println("The priority of this thread is "+PriorityThreads.currentThread().getPriority());
        		for(int i=1;i<=10;i++)
        		{
        			System.out.println(i);
        			PriorityThreads.currentThread();
        			Thread.sleep(1000);
        		}
        	
            } 
		catch (InterruptedException e) 
		{
			Thread.currentThread().interrupt();
		}
     	
		
	}
	public static void main(String args[]){
		PriorityThreads T1= new PriorityThreads();
		T1.setPriority(MAX_PRIORITY);
		
		PriorityThreads T2= new PriorityThreads();
		T2.setPriority(MIN_PRIORITY);	

		PriorityThreads T3= new PriorityThreads();
		T3.setPriority(NORM_PRIORITY);	

		PriorityThreads T4= new PriorityThreads();
		T4.setPriority(4);
		
		T1.start();
		T2.start();
		T3.start();
		T4.start();

		
	}
	

}
