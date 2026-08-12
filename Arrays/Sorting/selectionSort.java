class selectionSort{

    public static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int small = i;

            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[small]){
                    small = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[small];
            arr[small] = temp;
        }

        for(int items : arr){
            System.out.println(items);
        }
    }

    public static void main(String[] args){
        System.out.println("Selection Sort");

        int arr[] = {7,3,9,2,5,1,8};

        selectionSort(arr);
    }
}
