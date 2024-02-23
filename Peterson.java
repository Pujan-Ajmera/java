import java.util.Scanner;
public class Peterson{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,rem=0,vari=0,sum=0;
		System.out.print("Enter a number:");
			a=sc.nextInt();
			b=a;

		while(a!=0){
			rem = a % 10;
			vari=fact(rem);
			sum +=vari;
			a=a/10;
		}
		if(sum==b){
			System.out.println("its a Peterson number");
		}
		else{
			System.out.println("Not a peerson number");
		}
	}


	public static int fact(int a){
		int i=1,mul=1;
		for(i=2;i<=a;i++){
			mul=mul*i;
		}
		return mul;
	}

}