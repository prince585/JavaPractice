class positiveNegative{

    public static void main(String[] args){
        int arr[] = {4,-2,7,-8,5,-1,3};

        int positive = 0;
        int negative = 0;

        for(int item : arr){
            if(item >= 0){
                positive++;
            }
            else{
                negative++;
            }
        }

        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
    }
}
