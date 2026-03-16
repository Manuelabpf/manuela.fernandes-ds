import java.util.Scanner;
public class DescontonoProduto8
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("digite o proço da compra: ");
	    double valor = sc.nextDouble();
	    
	    if (valor > 100){
	        valor = valor - (valor * 20/100);
	    } else{
	        valor = valor - (valor * 10/100);
	    }
	    System.out.println("Valor final: "+ valor);
	}
}