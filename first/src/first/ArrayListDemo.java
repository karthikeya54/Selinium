package first;

import java.io.Serializable;
import java.util.*;



public class ArrayListDemo  {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		
		al.add("Mi Phone");  //just adding and element at end of the list
		al.add("Samsung Phone");
		al.add("OnePlus");
		al.add(3,"Iphone");    //method is used to insert the specified element at specified index position
		System.out.println("The list "+al);
		System.out.println("size of the list is "+al.size()); //This method will return the count of no.of elements available in the list
		
		ArrayList al2=new ArrayList();
		System.out.println(al2);
		al2.add("1");
		al2.add("2");
		al2.add(6);
		al2.add("Waste 1");
		al2.add("Waste 1");
		al2.add("Waste 2");
		ArrayListDemo ArrayListDemo=new ArrayListDemo();
		System.out.println(al2);
		
		
		
		System.out.println("al2 after removing it removes 1st occurance"+al2.remove("Waste 1"));
		
		
		System.out.println("it removes in (particular) 4th index value  "+al2.remove(4));
		
		   //method is used to append all the elements available in specified collection into the list.
		System.out.println("adding the all elements from one collection to another collection "+al.addAll(al2));
		
		
		System.out.println("iphone is there/not is list "+al.contains("Iphone"));
		
		
		
		System.out.println("method is used to acess element that is available in specified index position "+al.get(3));
		System.out.println(al2.set(2, "changed via setting"));
		
		al.clear();
		System.out.println("This method will remove all the elements avilable in the list ");
		
		
		System.out.println("al ArrayList isEmpty or not  "+al.isEmpty());
		
		Object[] sd=al2.toArray();
		
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof EventListener);
		System.out.println(al instanceof RandomAccess);
		System.out.println(ArrayListDemo instanceof TestingInterface );
		
		System.out.println(al2.toArray());
		for(int i=0;i<sd.length;i++) {
			System.out.println(al2.get(i));
		}	
			
		ArrayList k=new ArrayList();
		k.add(45);
		k.add(45);
		k.add(45);
		k.add(45);
		k.add(45);
		
		System.out.println(k);
		
		
		
		
	}

	
}
