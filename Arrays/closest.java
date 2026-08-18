class closest{
    public static void main(String[] args){
        int arr[] = {10,4,7,2,15,9};
        int target = 8;
        int close = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(Math.abs(arr[i] - target) < Math.abs(close - target)){
                close = arr[i];
            }
        }

        System.out.println("closest = " + close);
    }
}
