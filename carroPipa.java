
import java.util.Scanner; 

public class carroPipa
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double litro = 0;
		
		double capacidade = 0;
		System.out.print("Capacidade do reservatório: ");
		capacidade = input.nextDouble();
		
		int nivel = 0;
		System.out.print("Nivel de regulagem do equipamento: ");
		nivel = input.nextInt();
		
		if (nivel == 1) {
		    litro = 12.5;
		} 
		if (nivel == 2) {
		    litro = 25.0;
		}
		else if (nivel == 3) {
            litro = 50.0;
		} 
		
		double minuto = capacidade / litro;
		int minutoInteiro = (int) minuto; 
		
		if (nivel >= 4) {
		    System.out.print("Nível somente de 1 até 3.");
		} else { 
		System.out.printf("O abastecimento levará: " + minutoInteiro + "min");
		}
		
		input.close();
	}
}
