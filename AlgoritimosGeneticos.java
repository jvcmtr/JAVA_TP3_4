
public class AlgoritimosGeneticos {

    private int posicaoDeRecombinacao;
    private int posicaoDeMutacao;

    public AlgoritimosGeneticos(){
        posicaoDeMutacao = (int) Math.floor(Math.random() * 100);
        posicaoDeRecombinacao = (int) Math.floor(Math.random() * 100);
    }

    public String[] recombinacao(String c1, String c2) {      
        posicaoDeRecombinacao = posicaoDeRecombinacao % c1.length();
        int pos = posicaoDeRecombinacao;

        String f1 = c1.substring(0, pos);
        String f2 = c2.substring(0, pos);

        f1 += c2.substring(pos, c2.length());
        f2 += c1.substring(pos, c1.length());

        return new String[]{f1, f2};
    }

    public String mutacao(String c1) {
        posicaoDeMutacao = posicaoDeMutacao % c1.length();
        int pos = posicaoDeMutacao;
        String possibleMutations = "ACGT";

        int randN = (int) Math.floor( Math.random() * 3 );
        possibleMutations = possibleMutations.replace((c1.charAt(pos)+" "), "");
        char newChar = possibleMutations.toCharArray()[randN];
        
        char[] newSequence = c1.toCharArray();
        newSequence[pos] = newChar;

        c1 = "";
        for (char c : newSequence) {
            c1 += c;
        }
        return c1;
    }



    public int getPosicaoDeRecombinacao() {
        return posicaoDeRecombinacao;
    }

    public void setposicaoDeRecombinacao(int index) {
        posicaoDeRecombinacao = index;
    }   

    public int getPosicaoDeMutacao() {
        return posicaoDeMutacao;
    }

    public void setPosicaoDeMutacao(int posicaoDeMutacao) {
        this.posicaoDeMutacao = posicaoDeMutacao;
    }
}
