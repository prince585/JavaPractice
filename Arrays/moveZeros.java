class moveZeros{
    public static void main(String[] args){
        int arr[] = {0,4,0,2,7,0,5,1};
        int pos = 0;

        for(int item : arr){
            if(item != 0){
                arr[pos] = item;
                pos++;
            }
        }

        while(pos < arr.length){
            arr[pos] = 0;
            pos++;
        }

        for(int item : arr){
            System.out.print(item + " ");
        }
    }
}
