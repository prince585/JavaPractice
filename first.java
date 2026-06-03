import java.util.*;
class first {
    public static void main(String[] args){
        System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        second s = new second();
        System.out.println("Enter the NUmber : ");
        int nos = sc.nextInt();
        s.num(nos);
    }
}


class second{
    public void num(int n){
        for(int i = 1; i <= 10; i=i+1){
            System.out.println(n*i);
        }

    }
}
