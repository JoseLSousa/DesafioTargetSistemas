import java.util.ArrayList;
import java.util.Arrays;

public class Pergunta2 {
    public static void main(String[] args) {
        int quantidadeLetras = ContarLetras("assombração");
        if (quantidadeLetras > 0) {
            System.out.println("A letra \"a\" apareceu " + quantidadeLetras + " vez(es).");
        } else {
            System.out.println("Não existe nenhuma letra \"a\" no texto.");
        }
    }

    public static int ContarLetras(String str) {
        int quantidade = 0;
        ArrayList<Integer> codigosDecimais = new ArrayList<>(Arrays.asList(65, 97, 193, 227, 225, 192, 224, 195));
        for (int i = 0; i < str.length(); i++) {
            if (codigosDecimais.contains(str.codePointAt(i))) {
                quantidade++;
            }
        }
        return quantidade;
    }
}
