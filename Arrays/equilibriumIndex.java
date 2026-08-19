class equilibriumIndex{

    public static void main(String[] args){
        int arr[] = {1,3,5,2,2};
        int total = 0;

        for(int item : arr){
            total += item;
        }

        int left = 0;
        for(int i = 0; i < arr.length; i++){
            total = total - arr[i];

            if(left == total){
                System.out.println("index = " + i);
                break;
            }

            left += arr[i];
        }
    }
}
