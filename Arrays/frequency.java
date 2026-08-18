class frequency{
    public static void main(String[] args){
        int arr[] = {2,3,2,5,3,2,4};
        int num = 2;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }

        System.out.println("frequency = " + count);
    }
}
