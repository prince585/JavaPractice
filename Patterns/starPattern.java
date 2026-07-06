class starPattern{
	public static void main(String[] args){
		System.out.println("Star Pattern!");

		for(int i = 0; i < 5; i++){
			for(int k = 0; k < i; k++){
				System.out.print("# ");
			}
			System.out.println(" ");
		}
		System.out.println();
	}
}
