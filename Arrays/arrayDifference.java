class arrayDifference{

    public static void main(String[] args){
        int arr[] = {12,5,8,19,4,11};

        int small = arr[0];
        int large = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < small){
                small = arr[i];
            }
            if(arr[i] > large){
                large = arr[i];
            }
        }

        System.out.println("difference = " + (large - small));
    }
}
