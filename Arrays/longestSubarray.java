class longestSubarray{

    public static void main(String[] args){
        int arr[] = {1,2,3,1,1,1,2};
        int target = 3;
        int longest = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = i; j < arr.length; j++){
                sum = sum + arr[j];
                if(sum == target && j - i + 1 > longest){
                    longest = j - i + 1;
                }
            }
        }

        System.out.println("longest = " + longest);
    }
}
