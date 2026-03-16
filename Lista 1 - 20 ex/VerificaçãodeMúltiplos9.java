import java.util.Scanner;
public class VerificaçãodeMúltiplos9
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Primeiro número: ");
	    int numero1 = sc.nextInt();
	    
	    System.out.println("Segundo número: ");
	    int numero2 = sc.nextInt();
	    
	    int multiplo = numero1 % numero2;
	    
	    if (multiplo == 0){
	        System.out.println("É múltiplo!");
	    } else{
	        System.out.println("Não é múltiplo!");
	    }
	}
}