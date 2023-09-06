
import java.util.Scanner;

public class questaoDois
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int base = 1;
		System.out.print("Base: ");
		base = input.nextInt();
		
		int altura = 1;
		System.out.print("Altura: ");
		altura = input.nextInt();
		
		System.out.printf("Resultado: " + base * altura + "cm²");
		
		input.close();
	}
}
