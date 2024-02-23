import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,rem=0,sum=0,b;
		
		System.out.println("Enter a number: ");
		a=sc.nextInt();
		b=a;
		while(a!=0){
			rem = a % 10;
			sum = sum*10 + rem;
			a = a/10;
		}
		if(sum == b){
			System.out.println("Number is a palindrome");
		}
		else{
						System.out.println("Number is not a palindrome");
		}

		char[] ch = new char[1000]; 
		System.out.println("Enter a String");
		for(i=0;i<arr.length)
	}
}