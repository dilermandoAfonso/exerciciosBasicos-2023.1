
import java.util.Scanner;

class questaoUm {
  
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    int dias = 1;
    System.out.print("Quantidade de dias:");
    dias = input.nextInt();
    
    int hora = 1;
    System.out.print("Quantidade de horas:");
    hora = input.nextInt();
    
    System.out.printf("Total de horas:" + (dias * 24 + hora));
    
    input.close();
  }
}