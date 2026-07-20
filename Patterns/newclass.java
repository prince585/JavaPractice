class newclass {
	public static void main(String[] args){
		System.out.println("Hey How are you doing!");

		int arr[] = {1,3,4,6,8,7};

		
		int maxProfit = 0;
		int profit = 0;
		int buyprice = 2;
		for(int i = 0; i < arr.length; i++){
			profit = arr[i] - buyprice;
			if(maxProfit < profit){
				maxProfit = profit;
			}
		}
		// the output of total final profit
		System.out.println(maxProfit);


	}
}
