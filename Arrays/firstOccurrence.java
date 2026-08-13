class firstOccurrence {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,4,6,8};
        int find = 2;
        int start = 0;
        int end = arr.length - 1;
        int answer = -1;

        while(start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == find){
                answer = mid;
                end = mid - 1;
            }else if(arr[mid] < find){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }

        System.out.println("first occurrence = " + answer);
    }
}
