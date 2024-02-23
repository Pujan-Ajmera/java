import java.util.Scanner;
public class Fabonachi{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,i;
		int ft=0,st=1,nt;
		System.out.print("Enter number of terms : ");
		a=sc.nextInt();
		System.out.println("The fabonachi series for "+a+" terms is:");
		System.out.print(ft+" "+st);
		for(i=3;i<=a;i++){
			nt=ft+st;
			System.out.println(nt+" ");
			ft=st;
			st=nt;
		}

	}
}