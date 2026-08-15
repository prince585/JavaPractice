class secondSmallest{

    public static void main(String[] args){
        int arr[] = {8,4,2,9,3,2,7};

        int small = arr[0];
        int second = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < small){
                second = small;
                small = arr[i];
            }
            else if(arr[i] < second && arr[i] != small){
                second = arr[i];
            }
        }

        System.out.println("smallest = " + small);
        System.out.println("second smallest = " + second);
    }
}
