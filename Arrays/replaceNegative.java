class replaceNegative{

    public static void main(String[] args){
        int arr[] = {4,-2,7,-5,3,-1};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }

        for(int item : arr){
            System.out.println(item);
        }
    }
}
