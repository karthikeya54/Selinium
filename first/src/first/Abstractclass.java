package first;
/*
 * A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
 */


/*

public class Abstractclass {

	public static void main(String[] args) {
		
		public int c;
		Phone m=new Mi();
		m.camera();
		m.ram();
		Phone s=new Samsung();
		s.camera();
		s.ram();	

	}

}
abstract class Phone{
	
	abstract void  camera();
	
	public void ram()
	{
		System.out.println("Ram for all phones are 4GB");
	}
}

class Mi extends Phone
{
	void camera()
	{
		System.out.println("For mi phone its pixel is 12MPX ");
	}
}

class Samsung extends Phone
{
	void camera() {
		System.out.println("For samsung camera its pixel is 24MPX ");
	}
}



*/




/*
 // Abstract class by using Constructor,,An abstract class can have a data member, abstract method, method body (non-abstract method), constructor, and even main() method.
 
class Abstractclass
{
	public static void main(String[] args) {
	
	Car M=new Maruthisuziki();
	M.speed();
	Car B=new Benz(); 
	B.speed();
		
	}
}

abstract class Car{
	 Car()
	{
		 System.out.println("This is constructor non-abstract method i will come to all non abstract and abstract also");
	}
	
	abstract void speed();
}

class Maruthisuziki extends Car
{
	void speed()
	{
		System.out.println("this speed max 150");
	}
}

class Benz extends Car
{
	void speed()
	{
		System.out.println("Benz speed max 220");
	}
}


*/





















