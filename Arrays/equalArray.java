class equalArray{
    public static void main(String[] args){
        int arr1[] = {1,2,3,4};
        int arr2[] = {1,2,3,4};
        boolean same = true;

        if(arr1.length != arr2.length){
            same = false;
        }
        else{
            for(int i = 0; i < arr1.length; i++){
                if(arr1[i] != arr2[i]){
                    same = false;
                    break;
                }
            }
        }

        System.out.println(same);
    }
}
