class sumPositive{

    public static void main(String[] args){
        int arr[] = {-3,5,-1,8,2,-6};
        int sum = 0;

        for(int item : arr){
            if(item > 0){
                sum += item;
            }
        }

        System.out.println(sum);
    }
}
