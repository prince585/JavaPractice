class moveNegative{
    public static void main(String[] args){
        int arr[] = {2,-4,5,-1,3,-6,7};
        int index = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
