import java.util.*;
class binarySearch{
    public static void main(String[] args){
        System.out.println("This is binary search");

        int[] arr = {1 , 2 , 3 ,4 , 5, 6 , 7 , 8};

        int key = 4;

        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;

            if (arr[mid] == key ){ System.out.println("array key found " + arr[mid] + " at index " + mid); break; }
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;

        }
    }
}
