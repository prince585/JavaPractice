class maxGap{

    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        int small = arr[0];
        int gap = 0;

        for(int i = 1; i < arr.length; i++){
            int current = arr[i] - small;
            if(current > gap){
                gap = current;
            }
            if(arr[i] < small){
                small = arr[i];
            }
        }

        System.out.println("max gap = " + gap);
    }
}
