class matrixSearch{

    public static void main(String[] args){
        int arr[][] = {
            {2,4,6},
            {8,10,12},
            {14,16,18}
        };

        int target = 10;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == target){
                    found = true;
                    System.out.println("found at " + i + " " + j);
                }
            }
        }

        if(!found){
            System.out.println("not found");
        }
    }
}
