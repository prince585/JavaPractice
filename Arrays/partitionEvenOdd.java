class partitionEvenOdd{

    public static void main(String[] args){
        int arr[] = {5,2,8,7,3,4,6,1};
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            while(left < right && arr[left] % 2 == 0){
                left++;
            }
            while(left < right && arr[right] % 2 != 0){
                right--;
            }

            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
