class pairSum{
    public static void main(String[] args){
        int arr[] = {2,7,4,1,6,3};
        int target = 8;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
