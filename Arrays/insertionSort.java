class insertionSort {
    public static void main(String[] args) {
        int arr[] = {6,2,9,1,5,3,8};
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for(int item : arr) {
            System.out.println(item);
        }
    }
}
