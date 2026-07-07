import java.util.Arrays;
class binarySearch{
	public static void main(String[] args){
		int arr[] = {1,4,6,7,5,3,8,9};
		// 1 2 3 4 5 6 7 8 9
		Arrays.sort(arr);
		
		int key = 6;

		int low = 0;
		int high = arr.length - 1;
		

		while(low <= high){
			int mid = (low + high) / 2;
			if(arr[mid] == key) {System.out.println("Found at " + mid); break;}
			if (arr[mid] > key) high = mid - 1;
			if(arr[mid] < key) low = mid + 1;
		}
	}
}
