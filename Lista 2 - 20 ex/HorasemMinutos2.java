import java.util.Scanner;
public class HorasemMinutos2
{
	public static void main(String[] args) {
	    Scanner sc1 = new Scanner(System.in);
	    
      System.out.print("Digite a quantidade de horas: ");
      int hora=sc1.nextInt();
      hora=hora * 60;
      System.out.println("Em minutos são: " +hora+".");
	}
}