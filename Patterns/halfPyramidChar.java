class halfPyramidChar{
	public static void main(String[] args){
		char character = 'A';
		for(int i = 0; i < 5; i++){
			for(int k = 0; k < i; k++){
				System.out.print(character);
				character++;
			}
			System.out.println();
		}
	}
}
