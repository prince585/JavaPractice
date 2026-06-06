import java.util.*;
class myNext{
    public static void main(String[] args){
        System.out.println("Hello Java!");

        // 5 = 5 x 4 x 3 x 2 x 1 ;

        System.out.println("This is Fabonaci Series");
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 1;
        for(int i = n; i >= 1; i = i - 1){
            ans = ans * i;
        }
        System.out.println(ans);
    }
}
