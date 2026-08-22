class rowMinimum{

    public static void main(String[] args){
        int arr[][] = {
            {5,8,2,4},
            {7,3,9,1},
            {6,4,8,2}
        };

        for(int i = 0; i < arr.length; i++){
            int min = arr[i][0];
            for(int j = 1; j < arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            System.out.println(min);
        }
    }
}
