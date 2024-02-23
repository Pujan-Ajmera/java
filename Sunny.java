import java.util.Scanner;
public class Sunny{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.print("Enter a number: ");
	a=sc.nextInt();
	b=a+1;
	System.out.println(Math.pow(b,0.5));
	System.out.println((int)Math.pow(b,0.5));
double check=(Math.pow(b,0.5)-(int)Math.pow(b,0.5));
System.out.println(check);

	if(check==0.0){
		System.out.println("Sunny");
	}
	else{
		System.out.println("Not sunny");
	}
	}
}