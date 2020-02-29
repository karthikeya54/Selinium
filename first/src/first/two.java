package first;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class two extends Thread  {
	private Strings test;
	private Strings test2;

	public two(Strings test, Strings test2) {
		
		this.test = test;
		this.test2 = test2;
	}

	public two(Strings test) {

		this.test = test;

	}

	public two() {

	}

	@Override
	public void run() {
		runtest2();
	}

	public Strings getTest() {
		return test;
	}

	public void setTest(Strings test) {
		this.test = test;
	}

	public Strings getTest2() {
		return test2;
	}

	public void setTest2(Strings test2) {
		this.test2 = test2;
	}

	void runtest1() {

	}

	void runtest2() {
		for(int i=1;i<=100000;i++)
		{
	System.out.println("threadName:"+this.currentThread().getName()+"time:"+LocalDateTime.now());
			/**/		
		}
	
		
		

	}
}