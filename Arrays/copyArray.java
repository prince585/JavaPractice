class copyArray{

    public static void main(String[] args){
        int arr[] = {3,6,1,8,4};
        int copy[] = new int[arr.length];

        for(int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }

        for(int item : copy){
            System.out.println(item);
        }
    }
}
