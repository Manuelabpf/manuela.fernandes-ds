import java.util.Scanner;
public class ConsumodeEnergia18
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("consumo de energia (kWh):");
	    double consumo = sc.nextDouble();
	    
	    if(consumo < 100){
	        consumo = consumo * 0.20;
	        System.out.println("Valor a pagar: R$"+ consumo);
	    } else{
	        consumo = consumo * 0.25;
	        System.out.println("Valor a pagar: R$"+ consumo);
        }
	    
	}
}