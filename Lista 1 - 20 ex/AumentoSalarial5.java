import java.util.Scanner;
public class AumentoSalarial5
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salário: ");
		double salario = sc.nextDouble();
		
		if (salario <= 2000.0){
		    salario = salario + (salario * 10/100);
		}
		else if(2000.0 > salario && salario < 4000.0){
		    salario = salario + (salario * 7/100);
		}
		else if(salario >= 4000){
		    salario = salario + (salario * 5/100);
		}
		System.out.println("Seu novo salário: "+ salario);
	}
}