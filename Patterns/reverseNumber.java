import java.util.*;
class reverseNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number!");
		int num = sc.nextInt();
		int lastdigit = 0;
		for (int i = 0; i < num; i++){
			lastdigit = num % 10;
			num = num / 10;
			System.out.print(lastdigit);
		}
	}
}
