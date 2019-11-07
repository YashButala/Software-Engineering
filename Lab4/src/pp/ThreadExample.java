import java.util.*;
import java.io.*;

class RunnableThread implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("RunnableThread - START" + Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);

			doProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("RunnableThread - END" + Thread.currentThread().getName());
	}
	private void doProcessing() throws InterruptedException
	{
		Thread.sleep(5000);
	}
}

class MyThread extends Thread
{
	public MyThread(String name)
	{
		super(name);
	}
	@Override
	public void run()
	{
		System.out.println("MyThread - START" + Thread.currentThread().getName());
		try
		{
			Thread.sleep(1000);

			doProcessing();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("MyThread - END" + Thread.currentThread().getName());
	}

	private void doProcessing() throws InterruptedException
	{
		Thread.sleep(5000);
	}
}

public class ThreadExample
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new RunnableThread(), "t1");
		Thread t2 = new Thread(new RunnableThread(), "t2");
		Thread t3 = new Thread(new RunnableThread(), "t3");
		Thread t4 = new Thread(new RunnableThread(), "t4");
		Thread t5 = new Thread(new RunnableThread(), "t5");
		System.out.println("Starting runnable threads");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

		System.out.println("Runnable Thread has been started");
		Thread t6 = new MyThread("t6");
		Thread t7 = new MyThread("t7");
		Thread t8 = new MyThread("t8");
		Thread t9 = new MyThread("t9");
		Thread t10 = new MyThread("t10");
		System.out.println("Starting MyThreads");
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
		System.out.println("MyThreads has been started");

	}
}