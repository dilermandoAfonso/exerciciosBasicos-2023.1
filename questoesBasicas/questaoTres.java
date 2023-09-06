
import java.util.Scanner;

class questaoTres {
  
  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    
    int hora = 1;
    System.out.print("Horas em minutos:");
    hora = input.nextInt();

    System.out.println("Total de minutos:" + hora * 60);

    System.out.print("Horas em segundos:");
    hora = input.nextInt();

    System.out.printf("Total de segundos:" + hora * 3600);
    
    input.close();
    
  }
}