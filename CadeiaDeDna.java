import java.util.Random;

public class CadeiaDeDna {

    private String sequencia = "";
    private String[] proteinas = new String[]{"A", "C", "G", "T" };

    public CadeiaDeDna(int tamanho){
        Random rng = new Random();
        for (int i = 0; i < tamanho; i++) {
            sequencia += proteinas[rng.nextInt(proteinas.length)];
        }
    }

    public String getCadeia(){
        return sequencia;
    }
}
