import java.util.Scanner;
public class Automorfic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,square=0,cdig=0,rem=0,rem2=0;
		System.out.print("Enter a Number:");
		a=sc.nextInt();
		square=a*a;
		b=a;
		while(a!=0){
			rem=a%10;
			cdig++;
			a=a/10;
		}
		System.out.println("Total digits are:"+cdig);
		
		//System.out.println(square);
		//int check;
		//check=(int)Math.pow(10,cdig);
		//System.out.println(check);
		
		rem2=square%((int)Math.pow(10,cdig));
		if(rem2==b){
			System.out.println("The number is autotrophic");
		}
		else{
			System.out.println("Its is not ");
		}
		


	}
}