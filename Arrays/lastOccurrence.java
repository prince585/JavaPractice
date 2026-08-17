class lastOccurrence{

    public static void main(String[] args){
        int arr[] = {2,5,3,5,7,5,1};
        int key = 5;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                index = i;
            }
        }

        System.out.println(index);
    }
}
