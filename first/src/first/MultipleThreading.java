package first;

/*
public class MultipleThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread k=new MyThread();
		k.start();
		MyThread k2=new MyThread();
		k2.start();
		System.out.println("main");
		
		
	}

}


class MyThread extends Thread {

	
	public void start() {
		//super.start();
		System.out.println("start");
	}

	public void run() {
		System.out.println("run");
	}

}

*/


/* 
 
class MultipleThreading 
{
	public static void main(String[] args) {
		MyThread m=new MyThread();
		m.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("my main class");
		}
		
		MyThread k=new MyThread();
		k.start();
		
		MyThread q=new MyThread();
		q.start();
		q.start(); //with same ref vari we cannot get,it rises illegalThreadStateException
	}
}

class MyThread extends Thread
{
public void run()
{
for(int i=1;i<=10;i++)
{
	System.out.println("my run thread"+i);
}
}
}


*/


/*

class MultipleThreading implements Runnable
{  
public void run()
{  
System.out.println("thread is running...");  
}  
  
public static void main(String args[])
{  
	MultipleThreading m1=new MultipleThreading();  
Thread t1 =new Thread(m1);  
t1.start(); 

Thread t2 =new Thread(m1);  
t2.start(); 

Thread t3 =new Thread(m1);  
t3.start(); 
 }  
}  


*/


/*

//we cant expect the output, becoz thread scheduler will deicide what to execute first....

class MyThread extends Thread {

	public void run() {
		for(int i=1;i<20;i++)
		System.out.println("child method");
	}

}

public class MultipleThreading {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		Thread t1 = new Thread(t);
		t1.start();
		for(int i=1;i<20;i++)
		System.out.println("main method");
	}
}

*/





/*

//we are seting and getting the priority


class MyThread extends Thread {
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("child thread");

		}
}

}

public class MultipleThreading
{
	public static void main(String[] args) {
		MyThread kk=new MyThread();
		kk.start();
		System.out.println(Thread.currentThread().getName()); 
		System.out.println(Thread.currentThread().getName()); 
		System.out.println("main method");
		Thread.currentThread().setName("User Thread");
		System.out.println(Thread.currentThread()); 
		System.out.println(Thread.currentThread().getName());

		
		
	}
}

*/



/*

//Thread priorities:

//Every thread in java has some priority it may be default priority     generated by JVM or explicitly provided by the programmer.
// Thread. MIN_PRIORITY--------->1
// Thread. MAX_PRIORITY-------->10
// Thread. NORM_PRIORITY--------->5

//if we are passing more than 10 number then it gives,...  IllegalArgumentException.
//The default priority only for the main thread is 5. But for all remaining threads the default priority will be inheriting from parent to child.


class MyThread extends Thread {
	 
public void run()
	{
		System.out.println("hello");
	}
}
       
public class MultipleThreading {
	public static void main(String[] args) {
		
		
		System.out.println(Thread.currentThread().getPriority());
		
		
		MyThread one = new MyThread();
		MyThread two=new MyThread();
		one.start();
		//one.setPriority(1); //
		System.out.println(one.getPriority()); //NOrmally jvm gives priority for a thread i.e., 5.... If we setPriority then it will be setted that priority.
		
		//two.setPriority(10);  //
		System.out.println(two.getPriority());
		
		System.out.println(Thread.MAX_PRIORITY);  //we can use these variable names for the priority also...
		System.out.println(Thread.MIN_PRIORITY);
		
		//Thread.currentThread().setPriority(73); //It rises exception
		//System.out.println(t.getPriority());
		
		
	}
}


*/



/*
//join(); -its working properly

class Mythread extends Thread
{
	public void run()
	{
		
		for(int i=1;i<10;i++)
		System.out.println("run is "+i);
	}
	
}

class MultipleThreading
{
	public static void main(String[] args) {
		Mythread k=new Mythread();
		k.start();
		try {
			k.join();  // we r writing k.join(); k belongs to Mythread class, so after completion of k ref then only it executes another thread
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Mythread j=new Mythread();
		j.start();
		try {
			j.join(); //after completion of k refvar thread, then only itcomes to j thread, after completion of j, then only it goes to main  
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		for(int i=1;i<10;i++)
		{
			System.out.println("main is "+i);
		}
	}
}


*/



/*
//sleep() - If a thread don�t want to perform any operation for a particular amount time then we should go for �sleep ()� method.


class MultipleThreading
{
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("welcome to multiple threads");
		
		//Thread.sleep(1000);
		
		System.out.println("no 1");
		//Thread.sleep(2000);
		
		System.out.println("no 2");
		//Thread.sleep(2000);
		
		System.out.println("no 3");
		//Thread.sleep(1000);
		
	}
}

*/




/*

//inturrept(); - working 
class MyThread extends Thread {
public void run() {
		try {
			
			for (int i = 0; i < 20; i++) {
				System.out.println("lazy thread" + i);
				Thread.sleep(2000);	
				
			}
		} catch (Exception e) {
			System.out.println("got interrupted");
		}

	}
}

public class MultipleThreading {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();  //1st step invokes run(),enters into try-for-lazythread-1,next step sleep, so when run() sleeping, t.interrupt() will come and interupts the method, inturept() wil work when sleep or wait() is only there, if its not there it runs normal flow...
		//t.interrupt();//
		
			
		
		System.out.println(" end of main thread");

	}
}


*/



































































