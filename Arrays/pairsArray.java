class pairsArray{
	public static void main(String[] args){
		System.out.println("Pairs In Array!");

		int arr[] = {1,2,3,4,5,6,7,8,9};

		for(int i = 0; i < arr.length ; i++){
			for(int j = i+1; j < arr.length ; j++){
				System.out.print("(" + arr[i] + "," + arr[j] + ")");
				// Printing all pairs
			}
			System.out.println();
		}

	}
}
