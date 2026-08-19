class subarraySum{

    public static void main(String[] args){
        int arr[] = {2,4,1,3,2,5};
        int target = 7;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum = sum + arr[j];
                if(sum == target){
                    System.out.println("from " + i + " to " + j);
                }
            }
        }
    }
}
