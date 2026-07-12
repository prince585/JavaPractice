class buysell {
		
	public static int buyandsell(int prices[]){


	int buyprice = Integer.MAX_VALUE;
	int maxProfit =0;

	for (int i =0; i < prices.length; i++){
		if(buyprice < prices[i]){
				//profit we are getting
			int profit = prices[i] - buyprice;
				// Maximum Profit made
			maxProfit = Math.max(maxProfit, profit);
		}
		else {
			buyprice = prices[i];
		}
	}
	//output 
	return maxProfit;


	}

	public static void main(String[] args){
		int prices[] = {7,1,5,3,6,4};

		System.out.println(buyandsell(prices));
	}
	
}
