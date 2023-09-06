
import java.util.Scanner;

public class questaoSete
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int tapiocaSimples = 1;
		System.out.print("Quantidade de tapiocas simples: ");
		tapiocaSimples = input.nextInt();
		
		int tapiocaGourmet = 1;
		System.out.print("Quantidade de tapiocas gourmet: ");
		tapiocaGourmet = input.nextInt();
		
		double ingTapiocaSimples = 0.50;
		double ingTapiocaGourmet = 0.80;
		
		System.out.println("Quantidade total de tapiocas vendidas: " + (tapiocaSimples + tapiocaGourmet));
		
		System.out.println("Valor apurado com vendas de tapiocas simples: R$" + (tapiocaSimples * 5.00));
		
		System.out.println("Valor apurado com vendas de tapiocas gourmet: R$" + (tapiocaGourmet * 8.00));
		
		System.out.println("Valor bruto apurado com as vendas: R$" + (tapiocaSimples * 5.00 + tapiocaGourmet * 8.00));
		
		System.out.println("Valor líquido apurado com as vendas: R$" + (tapiocaSimples * 5.00 - ingTapiocaSimples + tapiocaGourmet * 8.00 - ingTapiocaGourmet));
		
	input.close();
	}
}
