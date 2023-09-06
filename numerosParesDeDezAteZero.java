
import java.util.Scanner;

public class numerosParesDeDezAteZero
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int numero = 10;
		
		do {
		   System.out.println(numero);
		   numero = numero - 2;
		   
		} while (numero >= 0 && numero <= 10);
		
		input.close();
	}
}
