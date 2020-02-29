package first;

public class one {
    
	void test()
	{
	for(int i=0;i<100000;i++)
	{
		System.out.println("printing number test1:"+i);
	}
	
	}
	void test2()
	{
	for(int i=0;i<100000;i++)
	{
		System.out.println("printing numbe test2r:"+i);
	}
	}
	
		
	
	
	public static void main(Strings[] args) throws InterruptedException {

		/*
		 * Thread t=new Thread(new two()); t.start();
		 * 
		 */
	Thread t=new two();
	t.start();

	t.join();

	Thread t1=new two();
	t1.start();
	t1.join();
	
	Thread t2=new two();
	t2.start();

	}

	
	
}
	
	
	
	
	

