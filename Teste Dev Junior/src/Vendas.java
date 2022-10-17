import org.json.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Vendas {
   Dado dado = new Dado();
   ArrayList $vendas = new ArrayList<Dado>();
   ArrayList acimaMedia = new ArrayList<Dado>();
   public String capturaJson() {

       String caminho = "dados.json";
       String linha = "";
       String arquivoJson = "";
       File arquivo = new File(caminho);
       FileReader leitor = null;


       try {
           leitor = new FileReader(arquivo);
       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       }

       BufferedReader bf = new BufferedReader(leitor);

       try{
           while (bf.ready()) {
               linha = bf.readLine();
               arquivoJson = arquivoJson+linha;
           }

       bf.close();
       leitor.close();}
       catch (IOException ex){ex.printStackTrace();}


       return arquivoJson;

   }

   public void capturaDados(String arquivo){
        //obtem o objeto do arquivo dados.json
       JSONObject objeto = new JSONObject(arquivo);
       //obtém o array do objeto
       JSONArray dados = objeto.getJSONArray("Vendas");
       //percorre o array
       for(int i=0;i <dados.length();i++){
           JSONObject d = dados.getJSONObject(i);
           dado.setDia(d.getInt("dia"));
           dado.setFaturamento(d.getDouble("valor"));
           $vendas.add(dado);
           dado = new Dado();
       }

   }

   public void tratamentoDados(){

       int indiceMenor,indiceMaior,diaFaturado;
       double soma = 0;
       double maior = 0;

       indiceMaior=0;
       indiceMenor=0;
       diaFaturado=0;

       //Inicializando variável para verificação de menor faturamento
       Dado dado2 = (Dado) $vendas.get(0);
       double menor = dado2.getFaturamento();

       for (int i=0;i< $vendas.size();i++){

           Dado dado1 = (Dado) $vendas.get(i);

           if (dado1.getFaturamento() > 0){
               diaFaturado = diaFaturado + 1;
               soma = soma + dado1.getFaturamento();
           }
           if (dado1.getFaturamento() > maior){
               maior =  dado1.getFaturamento();
               indiceMaior = i;
           }
           if (dado1.getFaturamento() != 0 && dado1.getFaturamento() < menor){
               menor = dado1.getFaturamento();
               indiceMenor = i;
           }
       }

       double media = soma / diaFaturado;


       for (int i=0;i< $vendas.size();i++){
           Dado dado1 = (Dado) $vendas.get(i);
           if(dado1.getFaturamento() > media){
               acimaMedia.add(dado1.getDia());
           }

       }

           Dado $maior = (Dado) $vendas.get(indiceMaior);
           Dado $menor = (Dado) $vendas.get(indiceMenor);

           //Formatação para melhor visualização dos Dados de Vendas

           String padrao = "###,###.##";
           DecimalFormat md = new DecimalFormat(padrao);
           md.applyPattern(padrao);


           System.out.println("Dias válidos são: "+ diaFaturado);
           System.out.println("A soma do faturamento é: R$" + md.format(soma));
           System.out.println("Média é: R$" + md.format(media));
           System.out.println("Dias com faturamento acima da média: "+ acimaMedia);
           System.out.println("Dia mais vendido foi o dia :" + $maior.getDia());
           System.out.println("Maior faturamento foi :R$" + md.format($maior.getFaturamento()));
           System.out.println("O dia de menor faturamento foi o dia: " + $menor.getDia());
           System.out.println("O menor faturamento foi R$" + $menor.getFaturamento());


   }

   }






