// 1 - pedir peso em kg
// 2 - pedir altura em m
// 3 - calcular IMC => / (altura * altura)
// 4 - Exibir classificação
// < 18.5 => abaixo do peso
// >= 18.5 e <= 24.9 => peso normal
// >= 25 e < 29.9 => sobrepeso
// mais que isso: obesidade

package secao6_calcIMC;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em kg");

        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura");

        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if(imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if(imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if(imc >= 25 && imc < 29.9){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        scanner.close();


    }

}
