package secao5;

public class OperadorLogicos {

    public static void main(String[] args) {
        // 9 - and

        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        //true == true > true (variável)
        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = false;

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;

        // true && => true
        if(a > 55 && b > 10) {
            System.out.println("Deu certo! 2");
        }

        //9 - or

        boolean estaChuvendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estaChuvendo|| temGuardaChuva);

        System.out.println(false || false);

        System.out.println(10 > 20 || 100 == idade);

        int idade2 = 16;
        boolean ehMembro = false;

        // o usuário pode participar do clube
        // ele precisa ter > 16 anos OU ser membro

        if(idade2 > 16 || ehMembro) {
            System.out.println("Você pode entrar");
        } else {
            System.out.println("Entrada negada!");
        }

        // 10 - not
        System.out.println(estaChuvendo);
        System.out.println(!estaChuvendo);

        System.out.println(estaChuvendo || !temGuardaChuva);

        System.out.println(!(estaChuvendo || !temGuardaChuva));

    }

}
