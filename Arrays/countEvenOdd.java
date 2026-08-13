class countEvenOdd{
    public static void main(String[] args){
        int arr[] = {4,7,2,9,6,3,8,5};
        int even = 0;
        int odd = 0;

        for(int item : arr){
            if(item % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
