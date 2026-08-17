class oddNumbers{

    public static void main(String[] args){
        int arr[] = {2,7,4,9,6,3,8,5};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
