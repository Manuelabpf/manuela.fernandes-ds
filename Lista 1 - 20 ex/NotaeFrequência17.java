import java.util.Scanner;
public class NotaeFrequência17
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Digite a nota do aluno (0-10):");
	    int nota = sc.nextInt();
	    
	    System.out.println("Digite frequência do aluno (0-100):");
	    int frequencia = sc.nextInt();
	    
	    if(nota >= 7 && frequencia >= 75){
	        System.out.println("aluno aprovado!");
	    } else{
	        System.out.println("aluno reprovado!");
	    }
    }
}