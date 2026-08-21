class minimumRow{

    public static void main(String[] args){
        int arr[][] = {
            {7,4,9},
            {3,8,5},
            {6,2,1}
        };

        for(int i = 0; i < arr.length; i++){
            int min = arr[i][0];

            for(int j = 1; j < arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }

            System.out.println("row " + i + " min = " + min);
        }
    }
}
