import java.util.Scanner;
public class VerificadordeFaixaNumérica16 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if(num >= 10 && num <= 50)
            System.out.println("Dentro do intervalo");
        else
            System.out.println("Fora do intervalo");
    }
}
