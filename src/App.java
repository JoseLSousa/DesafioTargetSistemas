public class App {
    public static void main(String[] args) throws Exception {
        CalcularFibonacci(17712);
    }

    public static void CalcularFibonacci(int numero) {
        int numero1 = 0;
        int numero2 = 1;
        int aux;
        String mensagemPertence = "O numero: " + numero + " faz parte da sequencia Fibonacci.";
        if (numero == numero1 || numero == numero2) {
            System.out.println(mensagemPertence);
        } else {
            do {
                aux = numero1 + numero2;
                numero1 = numero2;
                numero2 = aux;
                System.out.println(aux);
            } while (aux <= numero);
            if (numero1 == numero)
                System.out.println(mensagemPertence);
            else
                System.out.println("O numero: " + numero + " não faz parte da sequencia Fibonacci.");

        }
    }
}
