class secondLargest{

    public static void main(String[] args){
        int arr[] = {5,8,2,9,3,7,9,1};

        int largest = arr[0];
        int second = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i] > second && arr[i] != largest){
                second = arr[i];
            }
        }

        System.out.println("largest = " + largest);
        System.out.println("second largest = " + second);
    }
}
