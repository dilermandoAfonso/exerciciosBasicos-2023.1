
import java.util.Scanner;

public class questaoSeis
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double salario = 1;
		System.out.print("Salário: ");
		salario = input.nextDouble();
		
		double aumento = 1;
		System.out.print("Percentual de aumento: ");
		aumento = input.nextDouble();
		
		double aumentoSalarial = salario * aumento / 100;
		
		System.out.printf("Salário aumentado: " + (salario + aumentoSalarial));
		
		input.close();
	}
}
