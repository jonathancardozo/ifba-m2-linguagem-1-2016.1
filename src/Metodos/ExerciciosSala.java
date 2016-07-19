package Metodos;

public class ExerciciosSala {
    
    public static void main(String[] args) {
        imprimirOlaMundo();
        olaVoce("Fulano");
        olaVoce("José");
        String frase = retornaOlaVoce("Maria");
        System.out.println(frase);
        
        int m = retornaMultiplicacao(2, 4);
        m = retornaSoma(m, 10);
        System.out.println("Resultado: " +  m);
    }
    
    public static void imprimirOlaMundo() {
        System.out.println("Ola Mundo");
    }
    
    public static void olaVoce(String nome) {
        System.out.println("Ola " + nome + "!");
    }
    
    public static String retornaOlaVoce(String nome) {
        return "Ola " + nome + "!";
    }
    
    // Exercicios
    // Metodo que imprime "IFBA - Linguagem I - 2015.1"
    public static void imprimirIfba() {
        System.out.println("IFBA - Linguagem I - 2015.1");
    }
    // Metodo que soma dois inteiros(argumentos) e exibe o resultado
    // Metodo que multiplica dois inteiros(argumentos) e exibe o resultado
    // Metodo que retorna a soma de dois inteiros
    public static int retornaSoma(int x, int y){
        return x + y;
    }
    // Metodo que retorna a multiplicacao de dois inteiros
    public static int retornaMultiplicacao(int x, int y){
        return x * y;
    }
    /*
    Utilizando os metodos que RETORNAM faça
    Multiplique 2 e 4 e some o resultado com 10
    Exiba o resultado na tela
    */
}
