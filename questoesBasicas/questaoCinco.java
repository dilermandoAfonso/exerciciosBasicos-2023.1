
import java.util.Scanner;

public class questaoCinco
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numeroDeCondominios = 1;
		System.out.print("Número de condomínios: ");
		numeroDeCondominios = input.nextInt();
		
		double taxa = 312.5;
		double taxaFesta = 50.0;
		
		System.out.printf("Arredação no mês de novembro: R$" + (numeroDeCondominios * 625.0 + taxa + taxaFesta));
		
		input.close();
	}
}
