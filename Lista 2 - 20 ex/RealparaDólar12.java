import java.util.Scanner;
public class RealparaDólar12 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor em reais: ");
        double reais = sc.nextDouble();

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = sc.nextDouble();

        double dolares = reais / cotacao;

        System.out.println("Você pode comprar: " + dolares + " dólares");
    }
}
