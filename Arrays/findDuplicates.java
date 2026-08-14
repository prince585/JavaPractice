class findDuplicates{
    public static void main(String[] args){
        int arr[] = {2,5,3,2,7,5,8,3};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
