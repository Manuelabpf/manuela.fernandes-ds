import java.util.Scanner;
public class CustoFinaldoProduto4
{
	public static void main(String[] args) {
	    Scanner sc1 = new Scanner(System.in);
	    
      System.out.print("Digite o preço do produto: ");
      Double pre=sc1.nextDouble();
      Double estadual=pre+(pre*(0.05));
      Double federal=pre+(pre*(0.07));
      System.out.print("O valor com a estadual sera de "+estadual+", a federal sera de "+federal);
      }
}
