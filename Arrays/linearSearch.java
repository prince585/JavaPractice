import java.util.Scanner;
class linearSearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String[] arr = {"Pizza", "Burgger", "Sandwich", "Pestry", "Cake"};
		System.out.println("***Thee are the options we have***");
		for(String item : arr){
			System.out.println(item);
		}
		System.out.println("Enter the Value To find :");
		String key = sc.next();
		int i =0;
		while(i < arr.length){
			if(arr[i].equalsIgnoreCase(key)){
				System.out.println("Found Item On Index : " + (i+1));
				break;
			}
		i++;
		}


	}
}
