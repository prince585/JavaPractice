class columnSum{

    public static void main(String[] args){
        int arr[][] = {
            {2,4,6},
            {1,3,5},
            {7,8,9}
        };

        for(int j = 0; j < arr[0].length; j++){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum = sum + arr[i][j];
            }
            System.out.println("column " + j + " = " + sum);
        }
    }
}
