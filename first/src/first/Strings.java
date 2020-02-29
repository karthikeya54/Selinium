package first;

//package Coaching;


public class Strings {

	public static void main(String[] args) {
 
//Where an string (String s=new String(); )object is stored and string variable="  " is stored and StringBuffer(test with =" ")) is stored, is it in heap/scp,,,
//Why its True / False, with Detailed Explaination... And what is difference b/w string,StringBuffer and String creation of new
		
String k=new String("hello");
String f=new String("raja");  

System.out.println(k==f);    
System.out.println(k.equals(f)); 

System.out.println( );

String m=new String("tel");
String n=new String("tel");

System.out.println(m==n);
System.out.println(m.equals(n));

System.out.println( );

String s="hello";
String x="hello";

System.out.println(s==x);  
System.out.println(s.equals(x));  

System.out.println( );

String o="haii";
String p="jaii";

System.out.println(o==p);
System.out.println(o.equals(p));

System.out.println( );

StringBuffer v=new StringBuffer("karthik");
StringBuffer c=new StringBuffer("hari");



System.out.println(v==c);
System.out.println(v.equals(c));

System.out.println( );

StringBuffer vv=new StringBuffer("karthik");
StringBuffer cc =new StringBuffer("karthik");

System.out.println(vv==cc);
System.out.println(vv.equals(cc));
		
		

	}

}





/*
class Strings
{
	public static void main(String[] args) {
		
		String name="karthikeya";  
		char ch=name.charAt(9);  
		System.out.println(ch); 
		
		
		String str="karthikeya";
 		//str=str.concat ("kanamarlapudi");
 		//str=str + "hari";
		//str+="hariii";    // To Concate two strings we can use + symbol alsooo.....

 		System.out.println(str);

 		
 		String h="karthikeya";
        System.out.println(h.equals("karthikeya")); 
        System.out.println(h.equalsIgnoreCase("KARTHIKEYA")); 
        
        
        String f="Ramu";
      //  System.out.println((f.length());
        
        String jk="kaarthikeya";
        System.out.println(jk.replace("a","dd"));
     
       String hj="halowen";
        System.out.println(hj.toUpperCase());
        
        String l=" PrAneETH    ";
        System.out.println(l.toLowerCase());
		System.out.println(l.trim());
		System.out.println(l.indexOf("A"));
		System.out.println(jk.lastIndexOf("a"));
		System.out.println(str.indexOf("a"));
		
		System.out.println(jk==hj);
		System.out.println(jk.equals(hj));
		
		String one="karthikeya";
		String two="karthikeya";
		
		System.out.println(one==two);
		System.out.println(one.contentEquals(two));
		
		
		
		
		
	}
}



*/





























