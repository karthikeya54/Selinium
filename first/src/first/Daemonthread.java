package first;

import java.io.PrintStream;

/*
//By default main() is not a DaemonThread... DaemonThread works in background to complete its tasks..



class Checking implements Runnable
{
	public void run()
	{
		
		System.out.println("Hiii Daemon Thread");
	}


}


public class Daemonthread {
	
public static void main(String[] args) {
	
	Checking k=new Checking();
	Thread t=new Thread(k);
	t.start();
	
	System.out.println(Thread.currentThread().isDaemon()); //to findout this current thread belongs to daemonthread or not, currentThread() means main() so its not a daemonThread...
	
	
}
	

}


*/


/*

class Daemonthread {
	public static void main(String[] args) throws InterruptedException {
		try {
			System.out.println("1st");
			Daemonthread Daemonthread = new Daemonthread();
			int i = Daemonthread.start();
			System.out.println(i);
			System.out.println(10 / 0);
		} catch (ArithmeticException e) {
			System.out.println("AE Raised");
		} finally {
			System.out.println("this is finally main");
		}
		System.out.println(10/0);
	}

	int start()  throws InterruptedException{
		int x = 30;
		try {
			System.out.println("2nd");
			
			 Thread.sleep(1000);
			
			System.out.println(10 / 0);
			return x;
		} catch (ArithmeticException e) {
			return x;

		} finally {
			System.out.println("this is finally start");
		}
	}
}

*/



class Daemonthread  extends RuntimeException
{
	public static void main(String[] args)   {
		
		throw new Daemonthread();
		
		
		//System.out.println(10/0);
		
		
	}
}
