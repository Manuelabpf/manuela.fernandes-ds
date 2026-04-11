import java.util.Scanner;
public class ContarLetrasEX17
{
    // Contar letras (for) //
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
	    
		 System.out.print("Digite uma palavra ou frase: ");
         String texto = sc1.nextLine();

        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            
            if (texto.charAt(i) != ' ') {
                contador++;
            }
        }
        System.out.println("O número total de letras (sem espaços) é: " + contador);
	}
}
