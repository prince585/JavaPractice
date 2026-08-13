class countOccurrence{
    public static void main(String[] args){
        int arr[] = {2,5,2,7,5,2,9,5};
        int find = 5;
        int count = 0;

        for(int item : arr){
            if(item == find){
                count++;
            }
        }

        System.out.println(find + " occurs " + count + " times");
    }
}
