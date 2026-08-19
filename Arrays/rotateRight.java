class rotateRight{

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        int n = 2;

        for(int x = 0; x < n; x++){
            int last = arr[arr.length - 1];

            for(int i = arr.length - 1; i > 0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = last;
        }

        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
