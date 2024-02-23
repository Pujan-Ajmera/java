import java.util.Scanner;
public class Tech{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,rem=0,c=0,sum=0,square=1,ch;
		int[] arr = new int[2];
		System.out.print("Enter a number: ");
		a=sc.nextInt();
		b=a;
		ch=a;
		while(a!=0){
			rem=a%10;
			c++;
			a=a/10;
		}
		System.out.println("No of digits is: "+c);
	if(c % 2 == 0){ 

		arr[0]= b % (int)Math.pow(10,c/2);
		arr[1]= b / (int)Math.pow(10,c/2);
		sum = arr[0] + arr[1];
		square = sum*sum;
	}
	System.out.println("Number is: "+arr[1]+" | "+arr[0]);

	if(square == b){
		System.out.println("Number is a techfest number");
	}

	else{
				System.out.println("Number is not a techfest number");

	}
		

	
	}
}