import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Questoes questoes = new Questoes();
        Scanner leia = new Scanner(System.in);
        int opcao;

       do {
           Menu.menuPrincipal();
           opcao = leia.nextInt();
            switch (opcao) {
                case 1:
                    questoes.soma();
                    break;

                case 2:
                    System.out.println("Digite o número que voce deseja verificar se pertence a Sequencia Fibonacci: ");
                    int numero = leia.nextInt();
                    questoes.calculofibonacci();
                    questoes.verificaFibonacci(numero);
                    break;

                case 3:
                    Vendas vendas = new Vendas();
                    vendas.capturaDados(vendas.capturaJson());
                    vendas.tratamentoDados();
                    break;

                case 4:
                    questoes.exibePorcentagem();
                    break;

                case 5:
                    System.out.println("Digite o nome que você deseja imprimir reverso: ");
                    String $nome = leia.nextLine();
                    System.out.println("O Reverso é: " + questoes.Mostrarreverse($nome));
                    break;

                case 0:
                System.out.println("Obrigado por utilizar nosso sistema!!!");
                break;

                default:
                    System.out.println("Opção inválida. Digite outro número");

            }
        } while(opcao!=0);

    } //End method Main
}//End Class