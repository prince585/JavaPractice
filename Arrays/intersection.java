class intersection{
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};
        int b[] = {3,5,7,1,9};

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}
