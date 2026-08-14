class sortZeroOne{
    public static void main(String[] args){
        int arr[] = {1,0,1,1,0,0,1,0};
        int zero = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                int temp = arr[zero];
                arr[zero] = arr[i];
                arr[i] = temp;
                zero++;
            }
        }

        for(int item : arr){
            System.out.println(item);
        }
    }
}
