
import java.util.Scanner;

public class mediaDeTresNotas
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int qtdNotas = 0; 
		double nota = 0;
		double notaTotal = 0;
		
		do {
		    System.out.print("Nota: ");
		    nota = input.nextDouble();
		    qtdNotas = qtdNotas + 1; 
		    notaTotal = notaTotal + nota; 
	    } while (qtdNotas < 3);
	
	    System.out.printf ("Media: %.2f", notaTotal / qtdNotas);
    }
}
