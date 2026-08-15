class reversePart{

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};

        int start = 2;
        int end = 5;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
