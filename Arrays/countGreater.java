class countGreater{

    public static void main(String[] args){
        int arr[] = {4,9,2,7,5,10,3};
        int value = 5;
        int count = 0;

        for(int item : arr){
            if(item > value){
                count++;
            }
        }

        System.out.println(count);
    }
}
