import java.util.Scanner;
public class IdadeparaVotar6
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sua idade: ");
		int idade = sc.nextInt();
		
		if (idade < 16){
		    System.out.println("Não pode votar!");
		}
		else if (idade >= 16 && idade < 18){
		    System.out.println("voto opcional");
		}else{
		    System.out.println("Voto obrigatório!");
		}
	}
}