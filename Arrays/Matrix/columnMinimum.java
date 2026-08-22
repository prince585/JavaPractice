class columnMinimum{

    public static void main(String[] args){
        int arr[][] = {
            {8,4,7},
            {3,9,2},
            {6,5,1}
        };

        for(int j = 0; j < arr[0].length; j++){
            int min = arr[0][j];
            for(int i = 1; i < arr.length; i++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
            System.out.println(min);
        }
    }
}
