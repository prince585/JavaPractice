class averageArray{

    public static void main(String[] args){
        int arr[] = {4,7,2,9,5};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        double average = (double) sum / arr.length;
        System.out.println(average);
    }
}
