import java.util.*;
class Basic {
	public static void main(String[] args){
		System.out.println("Hey I'm Prince!");
		// I Printed My Name!
		/*
		 * hey 
		 * yo 
		 * Prince
		 */
		String name = "Prince";
		// String Lenght() Fuction;
		System.out.println("Name Lenght is :" + name.length());
		// String character printing 
		System.out.println(name.charAt(2));
		// printing string in parts
		System.out.println(name.substring(0 ,4));
		// String cincatination == adding multiple String together
		String surname = "Verma";
		String fullName = name + " " + surname;
		System.out.println(fullName);

		// Input 
		Scanner sc = new Scanner(System.in);

		String usrName = sc.nextLine();

		boolean con = usrName.equals(fullName);
		System.out.println(con);
		sc.close();
		
		// type casting 
		// there are two types of type casting 
		// implicit == can be change internally without any extra function
		// explicit need function to covert


		// emplicit
			int n = 5;
			double k = n;
			// it will be converted 
		// explicit
			double l = 5.2;
			// int k = n; this will not work 
			double j = (double) l;
			//  it will work now

   		// final keyword : make value imutable;
		
			final int s = 10;







	}
}
