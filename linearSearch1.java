class linearSearch1 {
    public static void main(String[] args){
        int[] arr = {2,3,4,5,1,8,7,9};
        int value = 7;
        for (int i = 0; i < arr.length; i=i+1){
            if(value == i) {
                System.out.println("Value found at :"+ i);
                break;
            }
            else System.out.println("value not found!" + i);
        }
    }
}
