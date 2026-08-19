class secondMostFrequent{

    public static void main(String[] args){
        int arr[] = {2,3,2,5,3,2,5,5,7,3,3};

        int first = 0;
        int second = 0;
        int firstCount = 0;
        int secondCount = 0;

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > firstCount && arr[i] != first){
                second = first;
                secondCount = firstCount;
                first = arr[i];
                firstCount = count;
            }
            else if(count > secondCount && arr[i] != first){
                second = arr[i];
                secondCount = count;
            }
        }

        System.out.println("second most frequent = " + second);
    }
}
