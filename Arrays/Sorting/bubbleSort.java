class bubbleSort{

		//bubble sort method
	public static void bubbleSort(int arr[]){
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length -1 - i; j++){
			if(arr[j] < arr[j+1]){
			int temp = arr[j];
			arr[j] = arr[j+1];
			arr[j+1] = temp;
				}
			}
		}

		for(int items : arr){
			System.out.println(items);
		}
	}


	public static void main(String[] args){
		System.out.println("Bubble Sort");

		int arr[] = {5,4,8,2,3,6,9,7,1};

		bubbleSort(arr);
		




	}
}
