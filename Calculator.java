
import java.util.Scanner;

public class Calculator {

	public static void main(String args[]) {
		
		int n1,n2,n3,ch;
		
		Scanner sc= new Scanner(System.in);
		
	   System.out.println("Enter first number:");
	   n1 = sc.nextInt();
	   System.out.println("Enter second number:");
	   n2 = sc.nextInt();
	   
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Enter your choice");
		
		ch = sc.nextInt();
		
		
		switch(ch)
		{
		    
			case 1:
				n3 = n1 + n2;
				System.out.println("Addition = "+n3);
			break;
			
			case 2:
				n3 = n1 - n2;
				System.out.println("subtraction = "+n3);
			break;
			
			case 3:
				n3 = n1 * n2;
				System.out.println("Multiplication = "+n3);
			break;
			
			case 4:
				n3 = n1 / n2;
				System.out.println("division = "+n3);
			break;
			
			default:
				System.out.println("Wrong choice");
			
		}
	}
}
		
		
