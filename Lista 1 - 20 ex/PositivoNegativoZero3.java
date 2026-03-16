import java.util.Scanner;
public class PositivoNegativoZero3
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite o Número: ");
	    int num = sc.nextInt();
	    
	    if (num < 0){
	        System.out.println("É negativo");
	    }
	    else if (num > 0){
	        System.out.println("É positivo");
	    } else{
	        System.out.println("É zero");
	    }
	}
}