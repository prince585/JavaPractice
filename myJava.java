class myJava {
    public static void main (String[] args){
        System.out.println("HEllo");

        // FIRST NUMBER
        int a = 2;
        // second number
        int b = 5;

        // temprory variable method

        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println("a is " + a + " b is " + b);

        // another method
         a = a + b;
         b = a - b;
         a = a - b;

        System.out.println("a is " + a + " b is " + b);
    }
}
