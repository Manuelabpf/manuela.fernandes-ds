import java.util.Scanner;
public class LoginSimples16
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("login:");
	    String login = sc.nextLine();
	    
	    System.out.println("senha:");
	    String senha = sc.nextLine();
	    
	    if (login.equals("admin") && senha.equals("1234")){
	        System.out.println("Acesso liberado");
	    }else{
	        System.out.println("acesso negado");
	    }
    }
}