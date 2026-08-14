class commonElements{
    public static void main(String[] args){
        int a[] = {2,4,6,8,10};
        int b[] = {1,3,4,6,9,10};

        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}
