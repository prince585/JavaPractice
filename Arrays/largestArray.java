import java.util.*;
class largestArray{
	public static void main(String[] args){
		int arr[] = {1,2,6,3,5};

		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++){
			if(largest < arr[i]){
				largest = arr[i];
			}
			if(smallest > arr[i]){
				smallest = arr[i];
			}
		}
		System.out.println("The Largest Value : " + largest);
		System.out.println("The Smallest Value : " + smallest);
	}
}
