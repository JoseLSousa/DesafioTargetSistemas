public class Pergunta1 {
    public static void main(String[] args) throws Exception {
        String resposta = CalcularFibonacci(0);
        System.out.println(resposta);
    }

    public static String CalcularFibonacci(int numero) {
        int numero1 = 0;
        int numero2 = 1;
        int aux;
        String mensagemPertence = "O numero: " + numero + " faz parte da sequencia Fibonacci.";
        if (numero == numero1 || numero == numero2) {
            return mensagemPertence;
        } else {
            do {
                aux = numero1 + numero2;
                numero1 = numero2;
                numero2 = aux;
                if (numero1 == numero) {
                    return mensagemPertence;
                }
            } while (aux <= numero);
        }
        return "O numero: " + numero + " não faz parte da sequencia Fibonacci.";
    }
}
