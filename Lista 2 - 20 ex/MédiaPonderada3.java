import java.util.Scanner;
public class MédiaPonderada3
{
	public static void main(String[] args) {
	    Scanner sc1 = new Scanner(System.in);
	    
      System.out.print("Digite a primeira nota (peso 1): ");
      Double nota1=sc1.nextDouble();
        System.out.print("Digite a segunda nota (peso 2): ");
      Double nota2=sc1.nextDouble();
        System.out.print("Digite a terceira nota (peso 3): ");
      Double nota3=sc1.nextDouble();
      Double notaf = (nota1*0.2)+(nota2*0.3)+(nota3*0.5);
      System.out.print("Sua media é de: "+notaf);
      }
}