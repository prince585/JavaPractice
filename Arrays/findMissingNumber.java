class findMissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,6,7};
        int total = 7 * 8 / 2;
        int sum = 0;
        for(int item : arr) {
            sum += item;
        }
        System.out.println("missing = " + (total - sum));
    }
}
