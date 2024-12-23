package secao2;

public class Exercicios {

    public static void main(String[] args) {

        /* EXECÍCIO 1:

        Crie uma variável int para armazenar o valor 10.
        Crie uma segunda variável int que armazene o dobro do valor para primeira varável
        usando operadores aritméticos.
        Exiba o resultado.
        */

        int num1 = 10;

        int num3 = num1 * 2;

        System.out.println(num3);

        /* EXERCÍCIO 2:

        Declare uma variavel char que armazene a letra 'B'.
        Faça o casting explícito dessa variável para int e exiba o valor númerico correspondente.

        */

        char Letra = 'B';

        int codigoAscci = (int) Letra;

        System.out.println(codigoAscci);

        /* EXERCÍCIO 3:

        Declare duas variáveis double para armazenarr os valores 15.75 e 20.40.
        Some os valores dessas varáveis e armazene o resultado em uma nova variável double.
        Exiba o resultado.

         */

        double numero1 = 15.75;

        double numero2 = 20.40;

        double numero3 = numero1 + numero2;

        System.out.println(numero3);

        /* EXERCÍCIO 4:

        Declare uma variável long para armazenar o número 2 bilhões (2_000_000_000).
        Em seguida, declare uma variável int faça o casting explícito do valor long para int.
        Exiba o resultado.

        */

        long n1 = 2_000_000_000L;

        int n2 = (int) n1;

        System.out.println(n2);

        /* EXERCÍCIO 5:

        Escreva um programa que crie uma variável String com o valor "Olá, mundo!".
        Em seguida, crie outra variável String que concatene a primeira variável com o texto
        " Bem-vindo ao Java!".

        * */

        String frase1 = "Olá, mundo!";

        String frase2 = frase1 + " Bem-vindo ao Java!";

        System.out.println(frase2);


    }
}
