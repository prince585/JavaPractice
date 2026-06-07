class newcode{
    public static void main(String[] args){
        System.out.println("Hello");

        int[] arr = {2 ,3 ,4 , 8, 9, 1, 5, 7, 6};

        for (int i =0; i < arr.length -1; i++){
            for(int j =0; j < arr.length -1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i =0; i < arr.length; i++){
        System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("the second  largest number is : " + arr[arr.length - 2]);
    }
}
