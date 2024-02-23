import java.util.Scanner;
public class Threecheck{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
			System.out.println("Enter three numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			c=sc.nextInt();

			if(a>b){
				if(a>c){
					System.out.print("a is greatest");
				}
				else{
					System.out.print("c is greatest");
				}
			}
			else{
				if(b>c){
					System.out.print("b is greatest");
				}

				else{
					System.out.print("c is greatest");
				}
			}

	}
}