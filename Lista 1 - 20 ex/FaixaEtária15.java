import java.util.Scanner;
public class FaixaEtária15
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("digite sua idade: ");
	    int idade = sc.nextInt();
	    
	    if(idade <= 12){
	        System.out.println("Você é criança!");
	    }
	    else if (13 <= idade && idade <= 17){
	        System.out.println("Você é adolecente!");
	    }
	    else if (18 <= idade && idade <= 59){
	        System.out.println("Você é adulto!");
	    }else{
	        System.out.println("Você é idoso!");
	    }
    }
}