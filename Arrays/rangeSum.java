class rangeSum{

    public static void main(String[] args){
        int arr[] = {2,4,1,3,5,6};
        int start = 1;
        int end = 4;
        int sum = 0;

        for(int i = start; i <= end; i++){
            sum = sum + arr[i];
        }

        System.out.println("sum = " + sum);
    }
}
