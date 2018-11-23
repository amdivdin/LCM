import java.util.Scanner;

public class Greatestnum {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	while(Integer.toString(a).contains(Integer.toString(b))) {
		a--;
	}
	System.out.println(a);
	}
	

}
