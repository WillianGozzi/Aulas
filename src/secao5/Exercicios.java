package secao5;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        /*
        > Exercício 1: Verificação de Categoria de prreço

        Peça ao usuário para inserir o preço de um produto.
        Se o preço for menor que 50, categorize-o como "Barato".
        Se estiver entre 50 e 100, categorize como "Médio".
        Se for maior que 100, categorize como "Caro". Exiba a categoria correspondente.

        >Exercício 2: Validação de login

        Peça ao usuário para inserir um nome de usuário e uma senha.
        Verifique se o nome de usuário é "admin" e a senha "1234".
        Se ambos forem correttos, exiba "Acesso permittido".
        Caso contrário, exiba "acesso negado".

        >Exercício 3: Identicação de paridade com Srings

        Peça ao usuário para inserir um número.
        Verifique se o número é para ou ímpar, exiba a palavra "Par ou "ímpar".
        Use uma string para armazenar o resultado e exibi-la

        Depois de avaliar o número, ttu vai colocar se é par ou ímpar em uma var.

        >Exercício 4: Identificação de dia útil

        Peça ao usuário para inserir um número de 1 a 7,
        representando os dias da semana (1 para domingo, 2 para segunda, etc.)
        Use switch para verificar se o dia é um dia útil (segunda a sexta)
        ou final de semana (sábado e domingo).
        Exiba uma mensagem correspondente.

        >Exercício 5: Verificação de intervalo com AND

        Peça ao usuário para inserir um número.
        Verifique se o número está no intervalo. Caso contrário, exiba "Fora do intervalo".
        Se estiver, exiba "Dentro do intervalo". caso contrário, exiba "fora do intervalo".

        >Exercício 6: Classificação de letra

        Peça ao usuário para inserir uma letra.
        Verifique se a letra é uma vogal (a, e, i, o u) ou uma consoante.
        Exiba "Vogal" ou "Consoante" de acordo com a entrada.
        Considere tanto letras maiúsculas quanto minúcuas.

         */

        // ex1

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");

        double preco = scanner.nextDouble();

        if(preco < 50) {
            System.out.println("Categoria: Barato");
        } else if(preco >= 50 && preco <= 100){
            System.out.println("Categoria: Médio");
        } else {
            System.out.println("Categoria: Caro");
        }

        // ex2
        System.out.println("Digite o nome do usuário: ");

        String usuario = scanner.next();

        System.out.println("Digite a senha do usuário: ");

        String senha = scanner.next();

        //Sting => equals
        if(usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }


        // ex3
        System.out.println("Digite um número");

        int numero = scanner.nextInt();

        String resultado = "";

        if(numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado= "ímpar";
        }

        System.out.println("O numero é: " + resultado);

        //ex4
        System.out.println("Insira um número de 1 a 7.");

        int num = scanner.nextInt();

        switch (num) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana");
                break;
            default:
                System.out.println("Número inválido");
                break;
        }

        //ex5
        System.out.println("Digite um número");

        int nume = scanner.nextInt();

        if (nume >= 10 && nume <= 20){
            System.out.println("Dentro do intervalo");
        } else {
            System.out.println("Fora do intervalo");
        }

        //ex6

        System.out.println("Insira uma letra:");

        char letra = scanner.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
                break;
        }


        scanner.close();


    }
}
