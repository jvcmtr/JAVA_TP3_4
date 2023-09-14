import java.util.Scanner;

public class Program {
    public static void main (String[] args){
        String s = "";
        int tamanho = 0;
                
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t             DNA");
        System.out.println("\t- recombinação e mutação -");
        System.out.println("========================");
        
        if (args.length == 0){
            Scanner in = new Scanner(System.in);
            System.out.print(" >> Digite o tamanho da cadeia : ");
            s = in.nextLine();
            in.close();
        }
        else{
            for (String string : args) {
                s += string;
            }
            System.out.println(" Tamanho da cadeia : " + s);
        }

        try{
            tamanho = Integer.parseInt(s);
        }
        catch(NumberFormatException e) {
            System.out.println("# ERRO: o numero que você digitou não é válido. \n Encerrando o programa... \n");
            System.out.println(e);
            return;
        }
        
        CadeiaDeDna c1 = new CadeiaDeDna(tamanho);
        CadeiaDeDna c2 = new CadeiaDeDna(tamanho);
        AlgoritimosGeneticos Gen = new AlgoritimosGeneticos();
    
        System.out.println("  CADEIA 1 :  " + c1.getCadeia());
        System.out.println("  CADEIA 2 :  " + c2.getCadeia());
        System.out.println();

        System.out.println("========================");
        String[] combinacao = Gen.recombinacao(c1.getCadeia(), c2.getCadeia()) ;
        System.out.println(" Indice aleatorio da recombinacao : " + Gen.getPosicaoDeRecombinacao() );
        System.out.println(" Resultado da recombinacao :");
        System.out.println("       CADEIA 1 :  " + c1.getCadeia());
        System.out.println("       CADEIA 2 :  " + c2.getCadeia());
        System.out.println(" RECOMBINACAO 1 :  " + combinacao[0]);
        System.out.println(" RECOMBINACAO 2 :  " + combinacao[1]);
        System.out.println();

        System.out.println("========================");
        String mutacao = Gen.mutacao( c1.getCadeia() );
        System.out.println(" Indice aleatorio da mutacao : " + Gen.getPosicaoDeMutacao() );
        System.out.println(" Resultado da mutacao:");
        System.out.println("  ORIGINAL :  " + c1.getCadeia());
        System.out.println("   MUTADA  :  " + mutacao);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
}
