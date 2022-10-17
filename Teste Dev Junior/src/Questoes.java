import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Questoes {

    public void soma() {

        int soma = 0;
        int k = 0;
        int indice = 13;
        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("O fim do processamento é: " + soma);

    }
    int[] termo = new int[32];
public void calculofibonacci(){
        int anterior, proximo, atual, posicao;

        posicao = 2;
        anterior = 0;
        atual = 1;

        termo[0]=0;
        termo[1]=1;

        while(posicao < 32) {
            proximo = anterior + atual;

            termo[posicao]=proximo;

            anterior=atual;

            atual=proximo;

            posicao++;
        }

    }

public void exibirLista(){
        for (int posicao=0;posicao<30;posicao++){
            System.out.println("O termo "+posicao+" é: "+ termo[posicao]);
        }
    }

public void verificaFibonacci(int numero){
        boolean pertence = false;
        int i = 0;
        for(i=0;i< termo.length;i++){
            if(numero == termo[i]){
                pertence = true;
                i= i+1;
                break;
            }
        }
        if (pertence = true) {
            System.out.println("O número pertence à Sequencia Fibonacci. O termo fica na posicao: " + i);
        }else{
            System.out.println("O número não pertence à Sequencia Fibonacci");
        }
   }

   public String calculoPorcentagem(double $estado, double $faturamento ){

    double $porcentagem;

    $porcentagem = ($estado/$faturamento) * 100;

    String padrao = "##.##";
    DecimalFormat df = new DecimalFormat(padrao);
    df.applyPattern(padrao);

    return df.format($porcentagem);
   }

public void exibePorcentagem(){

    double $SP,$RJ,$MG,$ES,$Outros,$faturamento;

    $SP = 67836.43;
    $RJ = 36678.66;
    $MG = 29229.88;
    $ES = 27165.48;
    $Outros = 19849.53;

    $faturamento = $SP + $RJ + $MG + $ES + $Outros;

    System.out.println("O estado de São paulo faturou: R$ " + $SP );
    System.out.println("O estado do Rio de Janeiro faturou: R$ " + $RJ );
    System.out.println("O estado de Minas Gerais faturou: R$ " + $MG );
    System.out.println("O estado do Espírito Santo faturou: R$ " + $ES );
    System.out.println("Demais estados faturaram: R$ " + $Outros );
    System.out.println("Faturamento total é: "+$faturamento);
    System.out.println("Total de Participação do Faturamento");

    System.out.println("São Paulo -> " + calculoPorcentagem($SP,$faturamento) +  "%");
    System.out.println("Rio de Janeiro -> " +calculoPorcentagem($RJ,$faturamento) + "%");
    System.out.println("Minas Gerais -> " +calculoPorcentagem($MG,$faturamento) + "%");
    System.out.println("Espírito Santo -> " +calculoPorcentagem($ES,$faturamento) + "%");
    System.out.println("Outros Estados -> " +calculoPorcentagem($Outros,$faturamento) + "%");

}
    public static String Mostrarreverse(String value){

    String $reverse = "";
    for(int i = (value.length()-1); i >= 0; i--){
        $reverse += value.charAt(i);
    }

    return $reverse;
    }
}// fim da classe


