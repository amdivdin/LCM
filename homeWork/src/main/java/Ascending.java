import java.util.Scanner;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String a=scan.next();
		char[] charArray = a.toCharArray();
        char temp=charArray[0];
        for(int i=1;i<=charArray.length-1;i++) {
        	if(charArray[i]<temp) {
        		temp=charArray[i]; 
        		System.out.println(temp);
        		}
        	else {
        		System.out.println(charArray[i]);
        	}
        	
        	
        	
        }
		
        
		
		
	}

}
