package secao8;

public class Funcoes {

    public static void main(String[] args) {

        // 1 - Criando a primeira função
        // tanto funcoes como variáveis, a gente nomeia
        saudacao();
        saudacao();
        saudacao();

        // 2 - parâmetros
        soma(2, 5);
        soma(47, 293);

        saudar("Willian");

        // return
        dobrar (4);

        int numero = 10;

        int numeroDobrado = dobrar(numero);

        System.out.println("O numero dobrado é: " + numeroDobrado);

        System.out.println(dobrar(12));

        //4 - retorno em varáivel
        String r1 = verificarPar(numero);

        String r2 = verificarPar(3);

        System.out.println(r1);

        System.out.println(r2);

        int x = dobrar(soma2(2,4));

        System.out.println(x);

    }

    // NIVEL DE ACESSO, STATIC =. não preciso intanciar clasa para executar, tipo retorno
    // NOME, OS PARENTESES (ARGS, BLOCO {}

    public static void saudacao() {

        System.out.println("Olá, esta é a minha primeira função");

    }

    public static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("O resultado da some é: " + resultado);

    }

    public static void saudar(String nome) {

        System.out.println("Olá, " + nome + ", tudo bem?");

    }

    public static int dobrar(int n) {
        return n * 2;
    }

    public static String verificarPar(int n) {
        if(n % 2 == 0) {
            return "O numero " + n + " é par!";
        } else {
            return "O numero " + n + "Não é par!";
        }
    }

    public static int soma2(int a, int b) {
        return a + b;
    }

}
