import java.util.Scanner;
public class PesoIdeal10
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Sua altura em metros: ");
	    double altura = sc.nextDouble();
	    
	    double imcHomem = (72.7 * altura) - 58;
	    double imcMulher = (62.1 * altura) - 44.7;
	    
	    System.out.println("Imc homem: "+ imcHomem);
	    System.out.println("Imc mulher: "+ imcMulher);
	}
}