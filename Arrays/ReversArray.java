class ReversArray{
	public static void main(String[] args){
		System.out.println("Reverse Array!");

		int arr[] = {1,2,3,4,5,6,7,8,9};

		for(int items : arr){
			System.out.println("value" + items);
		}

		int first =0;
		int last = arr.length - 1;

		while(first < last){
			
			int temp = arr[first];
			arr[first] = arr[last];
			arr[last] = temp;

			first++;
			last--;
		}

		for(int items : arr){
			System.out.println(items);
		}
	}
}
