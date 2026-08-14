class sumArray{
    public static void main(String[] args){
        int arr[] = {4,7,2,9,5,3};
        int sum = 0;

        for(int item : arr){
            sum = sum + item;
        }

        System.out.println("sum = " + sum);
    }
}
