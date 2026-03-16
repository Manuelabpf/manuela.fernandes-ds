import java.util.Scanner;
public class CalculadoraSimples12
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double resultado;

	    
	    System.out.println("Primeiro número: ");
	    double numero1 = sc.nextDouble();
	    
	    String operacao = sc.nextLine();
	    
	    System.out.println("Operação (+,-,*,/,): ");
	    operacao = sc.nextLine();
	    
	    
	    System.out.println("Segundo número: ");
	    double numero2 = sc.nextDouble();
	    
	    if (operacao.equals("+")){
	        resultado = numero1 + numero2;
	        System.out.println("Resultado: "+ resultado);
	    } 
	    else if(operacao.equals("-")){
	        resultado = numero1 - numero2;
	        System.out.println("Resultado: "+ resultado);
	    }
	    else if(operacao.equals("*")){
	        resultado = numero1 * numero2;
	        System.out.println("Resultado: "+ resultado);
	    }
	    else if(operacao.equals("/")){
	        resultado = numero1 / numero2;
	        System.out.println("Resultado: "+ resultado);
	    }
	    
	}
}