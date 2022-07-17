public class Operadores {

    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
       
        //incremento e decremento
        int numero = 5;
        //negando o valor
        numero = -numero;

        System.out.println(numero);
        //convertendo para positivo tem que multiplicar por -1 (conversão)
        numero = numero * -1;
        System.out.println(numero);

        //incremento - Decremento
        int numerox = 5;
        //numerox = numerox + 1 é o mesmo que:
        //numero = numero ++

        System.out.println(numerox ++);
        //após a incrementcao
        System.out.println(numerox);

        boolean variavel = true;
        //invertendo o valor da variavel
        System.out.println(!variavel);

        System.out.println(variavel);

        //condicional
        int a, b;
        a = 6;
        b = 6;
        //operador ternario booleana
        String resultado = a==b ? "Verdadeiro" : "Falso";
       
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual a numero 2? " + simNao);

        //operadores logicos
        // - && operador lógico "E"
        // - || operador "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2){
            System.out.println("as duas condições são verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("uma das condições é verdaeira");
        }

    }
}