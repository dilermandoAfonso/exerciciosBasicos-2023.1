
import java.util.Scanner;

public class inverterValores
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int num1 = 0;
		System.out.print("Primeiro número: ");
		num1 = input.nextInt();
		
		int num2 = 0;
		System.out.print("Segundo número: ");
		num2 = input.nextInt();
		
		if (num1 < num2) {
		    System.out.print(num1 + ", " + num2);
		} 
		else if (num2 < num1) {
		   System.out.print(num2 + ", " + num1);    
		}
        input.close();
	}
}
