import java.util.Scanner;
public class Prime{
public static void main(String[] args) {
	int a,c=0,i;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	a=sc.nextInt();

	for(i=2;i<a/2;i++){
		if(a % i == 0){
			c++;
		}
	}
	if(a==0 || a==1 || a==4){
				System.out.print("Number is not prime");
	}
	else if(c == 0){
		System.out.print("Number is prime");
	}

	else{
		System.out.print("Number is not prime");
	}
}
}