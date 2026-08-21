class rowMax{

    public static void main(String[] args){
        int arr[][] = {
            {2,5,1},
            {8,3,4},
            {6,7,2}
        };

        for(int i = 0; i < arr.length; i++){
            int max = arr[i][0];

            for(int j = 1; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }

            System.out.println("row " + i + " max = " + max);
        }
    }
}
