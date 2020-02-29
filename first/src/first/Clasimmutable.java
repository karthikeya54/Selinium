package first;

		
		class Classimmutable implements Cloneable {
			int i = 10;
			int j = 20;

			public static void main(String[] args) throws CloneNotSupportedException       {
				Classimmutable t1 = new Classimmutable();
				Classimmutable t2 = (Classimmutable) t1.clone();
				t2.i = 888;
				t2.j = 999;
				System.out.println(t1.i + "----" + t1.j);//10----20
			}
		

		
		

	

}
