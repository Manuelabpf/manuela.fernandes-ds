import java.util.Scanner;
public class ClassificaçãodeTriângulo20
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("medida 1:");
	    double medida1 = sc.nextDouble();
	    
	    System.out.println("medida 2:");
	    double medida2 = sc.nextDouble();
	    
	    System.out.println("medida 3:");
	    double medida3 = sc.nextDouble();
	    
	    if (medida1 == medida2 && medida2 == medida3){
	        System.out.println("Equilátero");
	    }
	    else if (medida1 == medida2 || medida2 == medida3){
	        System.out.println("Isósceles");
	        
	    }else if ((medida1 + medida2) < medida3){
	        System.out.println("Não é um triângulo");
	        
	    }else if (medida1 != medida2 && medida2 != medida3 && (medida1 + medida2) > medida3){
	        System.out.println("Escaleno");
	    }
	}
}