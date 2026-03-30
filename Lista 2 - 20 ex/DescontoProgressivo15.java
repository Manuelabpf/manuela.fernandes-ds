import java.util.Scanner;
public class DescontoProgressivo15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double desconto;
        
        System.out.print("Digite o preço do produto: ");
        double preco = sc.nextDouble();

        if (preco < 50) {
            desconto = 0.05;
        } else if (preco <= 100) {
            desconto = 0.10;
        } else {
            desconto = 0.15;
        }
        
        double finalPreco = preco - (preco * desconto);
        System.out.println("Preço final: R$" + finalPreco);
    }
}
