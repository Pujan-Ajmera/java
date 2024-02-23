import java.util.Scanner;
public class Animal{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int chicken,pig,cow;
		int value=0;
		System.out.println("Enter number of chicken:");
		chicken=sc.nextInt();

		System.out.println("Enter number of pigs:");
		pig=sc.nextInt();

		System.out.println("Enter number of cows:");
		cow=sc.nextInt();

		value=animal(chicken,cow,pig);
		System.out.print("nomber of animals is :"+value);
	}
	public static int animal(int a,int b,int c){
		int sum;
		sum = 2*a+4*b+4*c;
		return sum;
	}
}