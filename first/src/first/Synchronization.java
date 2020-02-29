package first;


//synchronized keyword - only one object, at a time only one thread can only acess,the same object cant acess at the same tym in another thread is called synchronization... 

/*

//program is about synchronized()

class synchromethod implements Runnable
{
	int count;
	 public synchronized  void run() //by keeping synchronized keyword,executing complition of one thread after only another thread executing will starts 
	{								//without synchronized keyword no.of threads can execute run() at a tym.
		for(int i=1;i<=10000;i++)
		{
			count++;
		}
	}
}



public class Synchronization {

	public static void main(String[] args) {
		
		synchromethod s=new synchromethod();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		
		t1.start();
		t2.start();
		
		try
		{
			t1.join();   //after completion of t1 thread, count =10000
			t2.join();   //after completion of t1 thread only t2 will be started becz join(); working is that only, after t2,then t2 will be dead count=20000. here we completed all threads execution, so at last count=20000 it wont change becz we kept synchronized keyword and join() also
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println(s.count);
		
	}

}




*/




/*

//explaination about Thread isAlive and Thread set and get Name

class synchromethod implements Runnable
{
	int count;
	 public synchronized  void run()  
	{								
		for(int i=1;i<=10000;i++)
		{
			count++;
		}
	}
}



public class Synchronization {

	public static void main(String[] args) {
		
		synchromethod s=new synchromethod();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		
		System.out.println(t1.isAlive());  //.isAlive(); method will works that method is alive or not  ---> upto now just t1 thread is created but not started, when it is started then only it is in falive.
		t1.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println("t1"+t1.isAlive());
		t2.start();
		System.out.println("t1"+t1.isAlive());
		System.out.println("t2"+t2.isAlive());
		
		
		//t1.setName("user setted this name Thread-1"); //without seting the name for a particular thread jvm gives normal names i.e., Thread-0,Thread-1
		//t2.setName("user setted this name for  Thread-2");  //un-comment this 
		
		System.out.println(t1.getName()); //normally java gives Thread-0 as name for first Thread Thread-1 as name for second Thread
		System.out.println(t2.getName());  //we can setName for the threads alsoo
		
		
		try
		{
			t1.join();   
			t2.join();   
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println(s.count);
		System.out.println("after complition of all t1 "+t1.isAlive()); //here t1 and t2 thread is dead so we r getting false
		System.out.println("after complition of all t2"+t2.isAlive());
	}

}


*/