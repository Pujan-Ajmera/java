import java.util.Scanner;
public class Neon{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	int a,rem=0,sum=0,b;
	System.out.print("Enter a number:");	
	a=sc.nextInt();
	int square;
	square= a * a;
	b=square;
		while(square != 0){
			rem=square % 10;
			sum=sum+rem;
			square=square/10;
		}
		if(sum==a){
			System.out.println("The number is neon");
		}
		else{
			System.out.println("The numbe is not neon");
		}
}

}