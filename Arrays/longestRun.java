class longestRun{

    public static void main(String[] args){
        int arr[] = {1,2,2,2,3,4,4,5,5,5,5,2};
        int count = 1;
        int max = 1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                count = 1;
            }

            if(count > max){
                max = count;
            }
        }

        System.out.println("longest run = " + max);
    }
}
