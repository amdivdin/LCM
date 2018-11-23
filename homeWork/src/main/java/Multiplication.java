import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int temp=0;
		int i;
		for( i=3;i<n;i++) {
			if(i%3==0||i%5==0) {
				temp=temp+i;
				
			
		}
	}
System.out.println(temp);
}
}
