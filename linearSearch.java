class linearSearch{
    public static void main(String[] args){
        System.out.println("This is Linear Search ");
        int[] arr = {1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9, 10};
        int key = 4;
        int i = 0;
        while(i <= arr.length - 1){
            if (arr[i] == key) System.out.println("key founf at " + i);
            i ++;
        }
    }
}
