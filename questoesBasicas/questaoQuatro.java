
import java.util.Scanner;

public class questaoQuatro
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double xBacon = 1; 
		System.out.print("Quantidade de X-Bacon: ");
		xBacon = input.nextInt();
		
		double xTudo = 1;
		System.out.print("Quantidade de X-Tudo: ");
		xTudo = input.nextInt();
		
		System.out.printf("Valor da Conta: " + "R$" + (xBacon * 10.00 + xTudo * 13.00 + 7.00));
		
		input.close();
	}
}
