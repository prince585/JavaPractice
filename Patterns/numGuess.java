import java.util.*;
class numGuess{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("This is A game Of Guessing Number Guess Number Between 1 - 10 !");
		int num = 3;
		int temp;
		do{
			System.out.println("Enter the number");
			temp = sc.nextInt();

			if(temp == num) System.out.println("you got it!");
			if(temp > num) System.out.println("too big pick a small Number!");
			if(temp < num) System.out.println("too small pick bigger number!");
		}while(temp != num);
	}
}
