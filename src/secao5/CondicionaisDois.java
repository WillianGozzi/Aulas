package secao5;

public class CondicionaisDois {

    public static void main(String[] args) {

        // 1- Condicional ternária

        int numero = 1;

        String resultado = (numero % 2 == 0) ? "Par" : "ímpar";

        System.out.println(resultado);

        // CONDICAO X > 5 ? EXPRESSAO SE É TRUE "OK" : EXPRESSÃO SE É FALSE "NÃO OK"

        int idade = 16;
        boolean temCarteira = false;

        if(idade >= 18) {

            if(temCarteira) {
                System.out.println("Pode dirigir");
            } else {
                System.out.println("Precisa ter a habilitação para dirigir");
            }
        } else {
            System.out.println("Você não pode dirigir ainda");
        }

        // 3 Precedencia
        boolean a = true;
        boolean b= false;
        boolean c = true;

        // true and false -> false or true ->
        boolean resultado2 = a && b || c;

        System.out.println(resultado2);

        //TRUE OU FALSE -> TRUE AND TRUE -> TRUE
        boolean resultado3 = a || b && c;

        System.out.println(resultado3);

        boolean resultado4 = !(a || b) && c;

        // not (true ou false) => not(true) => false and true => false
        System.out.println(resultado4);

        boolean resultado5 = (!a || b) && c;

        // (not true or false) and true
        // (false or false) and true
        // false and true
        // false
        System.out.println(resultado5);

        int idadee = 65;

        if(idadee < 18) {
            System.out.println("Menor de idade");

        }else if (idadee >= 18 && idadee <= 64) {
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }

    }
}
