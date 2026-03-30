import java.util.Scanner;

public class CálculodeComissão20 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da venda: ");
        double venda = sc.nextDouble();
        double comissao;

        if(venda < 1000)
            comissao = venda * 0.04;
        else if(venda <= 5000)
            comissao = venda * 0.06;
        else
            comissao = venda * 0.08;

        System.out.println("Comissão: " + comissao);
    }
}
