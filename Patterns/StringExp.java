class StringExp {
	public static void main(String[] args){
		String a = "Hello";
		String b = "HellO";

		a = a.toLowerCase();
		b = b.toLowerCase();
	
		System.out.println(check(a,b));
	}
	public static boolean check(String a, String b){

			return a.equals(b);
		}

}
