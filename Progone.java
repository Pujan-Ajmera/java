import java.util.*;
public class Progone{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//char a = sc.next().charAt(0);
	//System.out.println(a);
	int a,b;
	System.out.println("Enter a number: ");
	a=sc.nextInt();
	b=sc.nextInt();
	System.out.println("Enter a oprator: ");
	char a = sc.next().charAt(0);


	switch(a){
	case '+' :
		System.out.print("The sum is: ",a+b);
		break;

		case '-':
		System.out.print("The difference is: ",a-b);
		break;

		case '*' :
		System.out.print("The product is: ",a*b);
		break;

		case '/' :
		System.out.print("The divisor is: ",a/b);
		break;

		case '%' :
		System.out.print("The remainder is: ",a%b);
		break;

	default :
		System.out.print("Incorrect oprator:");
		break;
	}
	}
}