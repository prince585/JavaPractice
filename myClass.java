import java.util.*;
class myClass {
    public static void main(String[] args){
        System.out.println("hello");

        System.out.println("Enter Any Number To Check If it's Prime or Not");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 0) System.out.println("Not A Valid NUmber");
        Prime(num);

    }



    public static void Prime(int Num){
        int count = 0;
        for(int i = 2; i < Num; i = i+1){
            if(Num % i == 0){
                count ++;
            }
        }


        if(count == 0) System.out.println("Is Prime Number");
        else System.out.println("Is Not Prime Number");
    }
}
