import java.util.Scanner;
class ArrayCC{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		// commit
		int i =  0;
		while(i < 5){
			System.out.println("Enter the Number In Array : " + i);
			arr[i] = sc.nextInt();
			i++;
		}
		int k =0;
		while(k < 5 ){
			 System.out.println(arr[k]);
			 k++;
		}

		sc.close();
	}
}
