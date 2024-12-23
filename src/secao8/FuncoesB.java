package secao8;

public class FuncoesB {
    public static void main(String[] args) {

        // 5 - funcções com condicionais

        String r1 = verificarAacesso(19, true, true);

        System.out.println(r1);

        String r2 = verificarAacesso(25, false, true);

        System.out.println(r2);

        // 6 - Funões com swicht
        System.out.println(obterDiaDaSemana(5));

        System.out.println(obterDiaDaSemana(10));

        // 7 - System exit

        verificarAutenticacao("admin", "SenhaSegura");

        System.out.println("Oi!");

        // 8 - Documentação Funão

        System.out.println(calcularMedia(5, 6, 7));


    }

    public static String verificarAacesso(int idade, boolean temCarteira, boolean temHistoricoNegativo) {

        if(idade >= 18 && temCarteira && !temHistoricoNegativo){
            return "Acesso permitido: todos os critérios atendidos!";
        } else if(idade >= 18 && temCarteira && temHistoricoNegativo) {
            return "Acesso negado: Histárico negativo detectado!";
        } else {
            return "Acesso negado: Critérios não atendidos!";
        }
    }

    public static String obterDiaDaSemana(int dia) {

        switch (dia) {
            case 1:
                return "Segunda-feira";
            case 2:
                return "Terça-feira";
            case 3:
                return "Quarta-feira";
            case 4:
                return "Quinta-feira";
            case 5:
                return "Sexta-feira";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
            default:
                return "Dia invalido";
        }

    }

    public static void verificarAutenticacao(String usuario, String senha) {

        if(!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
            System.out.println("Autenticação falhou!");
            System.exit(1);
        }

        System.out.println("Autenticação bem sucedida!");

    }

    /**
     *Calcula a média de três números inteiros
     *
     * @param num1 o primeiro número/nota a ser enviado
     * @param num2 o segundo número/nota a ser enviado
     * @param num3 o terceiro número/nota a ser enviado
     * @return A média dos três números
     *
     */
    public static double calcularMedia(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

}
