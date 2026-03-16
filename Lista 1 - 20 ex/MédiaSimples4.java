import java.util.Scanner;
public class MédiaSimples4
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a 1° nota: ");
		double n1 = sc.nextDouble();

		System.out.println("Digite a 2° nota: ");
		double n2 = sc.nextDouble();
		
		System.out.println("Digite a 3° nota: ");
	    double n3 = sc.nextDouble();
	    
	    double med;
	    
	    med = (n1 + n2 + n3) / 3;
	    System.out.println("A média das notas é: "+ med);
	    
	    if (med >= 7){
	        System.out.println("aprovado!");
	    }
	    else if(5 <= med && med <= 7){
	        System.out.println("Recuperação");
	    }else if (med < 5){
	        System.out.println("Reprovado");
	    }
	}
}