class columnMax{

    public static void main(String[] args){
        int arr[][] = {
            {4,2,7},
            {1,9,3},
            {6,5,8}
        };

        for(int j = 0; j < arr[0].length; j++){
            int max = arr[0][j];

            for(int i = 1; i < arr.length; i++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }

            System.out.println("column " + j + " max = " + max);
        }
    }
}
