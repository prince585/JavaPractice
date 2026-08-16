class thirdLargest{
    public static void main(String[] args){
        int arr[] = {4,9,2,7,6,9,3};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for(int item : arr){
            if(item > first){
                third = second;
                second = first;
                first = item;
            }else if(item > second && item != first){
                third = second;
                second = item;
            }else if(item > third && item != second && item != first){
                third = item;
            }
        }

        System.out.println("third largest = " + third);
    }
}
