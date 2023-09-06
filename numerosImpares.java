
import java.util.Scanner;

public class numerosImpares
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
        
        int numero1 = 0;
        int numero2 = 0;
        
        do {
            System.out.print("Primeiro número: ");
            numero1 = input.nextInt();
            
            System.out.print("Segundo número: ");
            numero2 = input.nextInt();
           
            if (numero1 < 0 || numero2 < 0 ) {
                System.out.println("Não pode ser negativo.");
            }
            else if (numero1 > numero2) {
                System.out.println("O primeiro número não pode ser maior que o segundo número.");
            } else {    
            break;
            }
        } while (true);
        
        if (numero1 < numero2) {
            for (int numeros = numero1; numeros <= numero2; numeros++) {
                if (numeros % 2 != 0)
                System.out.println("Ímpar: " + numeros);
                input.close();
            }
        }   
	}
}
