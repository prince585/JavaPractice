class rowSumMax{

    public static void main(String[] args){
        int arr[][] = {
            {2,5,3},
            {7,1,4},
            {6,8,2}
        };

        int max = 0;
        int row = 0;

        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            if(sum > max){
                max = sum;
                row = i;
            }
        }

        System.out.println("row = " + row);
        System.out.println("sum = " + max);
    }
}
