package Metodos;

import java.util.Random;

/**
 *
 * @author jonathan
 */
public class ListaDeExercicios {

    public static void main(String[] args) {

        // Exercicio 01
        positovoOuNegativo(1);
        positovoOuNegativo(-1);
        positovoOuNegativo(0); // ?
        
        // Exercicio 02
        verificarNulo(0);

        // Exercicio 03
        calcularDelta(1, 5, -6);
        
        // Exercicio 04
        qualMaior(1, 2);
        qualMaior(2, 1);
        qualMaior(1, 1);
        
        // Exercicio 06
        maiorDeTres(1, 2, 3);
        maiorDeTres(3, 2, 1);
        
        // Página 04 Exercício 01
        menorDeTres(10,20,30);
        menorDeTres(30,20,10);
        
        // Página 04 Exercício 02
        System.out.println("2 a Quinta: " + elevaAQuinta(2));
        System.out.println("5 a Quinta: " + elevaAQuinta(5));
        
        // Exercicio 3 pg 4
        System.out.println("Sorteio: " + sortear());
        System.out.println("Sorteio: " + sortear());
        System.out.println("Sorteio: " + sortear());
        
        // Exercicio 4 pg 4
        System.out.println("Sorteio no Limite 2: " + sortearNoLimite(2));
        System.out.println("Sorteio no Limite 2: " + sortearNoLimite(2));
        System.out.println("Sorteio no Limite 2: " + sortearNoLimite(2));
        System.out.println("Sorteio no Limite 2: " + sortearNoLimite(2));
    }

    // Exercicio 01
    private static void positovoOuNegativo(int x) {
        if (x > 0) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
    }
    
    // Exercicio 02
    private static void verificarNulo(int x) {
        if(x == 0){
            System.out.println("Nulo");
        } else {
            System.out.println("Não é Nulo");
        }
    }

    // Exercicio 03
    private static void calcularDelta(double a, double b, double c) {
        //double delta = (b*b) - 4*a*c;
        // Math.pow
        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("Delta: " + delta);
    }
    
    // Exercicio 04
    private static void qualMaior(int a, int b){
        if(a > b){
            System.out.println("qualMaior("+a+"."+b+"): "+a+" é maior.");
        } else {
            System.out.println("qualMaior("+a+"."+b+"): "+b+" é maior.");
        }
    }
    
    // Exercicio 05448210702
    private static void qualMenor(int a, int b){
        if(a > b){
            System.out.println("qualMenor("+a+"."+b+"): "+b+" é o menor.");
        } else {
            System.out.println("qualMenor("+a+"."+b+"): "+a+" é o menor.");
        }
    }
    
    private static int retornaMaior(int a, int b){
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    // Exercicio 06
    private static void maiorDeTres(int a, int b, int c) {
        int maior = retornaMaior(a,b);
        maior = retornaMaior(maior,c);
        System.out.println("Maior("+a+","+b+","+c+"): "+maior);
    }
    
    // Pagina 02 Exercicio 01
    private static int retornaMenor(int a, int b){
        if(a > b) {
            return b;
        } else {
            return a;
        }
    }
    private static void menorDeTres(int a, int b, int c) {
        int menor = retornaMenor(a,b);
        menor = retornaMenor(menor,c);
        System.out.println("Menor de ("+a+","+b+","+c+") é "+menor);
    }
    
    // Pagina 02 Exercicio 02
    private static double elevaAQuinta(int x) {
        return Math.pow(x,5);
    }

    // Exercicio 3 pg 4
    public static int sortear() {
        Random r = new Random();
        return r.nextInt();
    }
    
    // Exercicio 4 pg 4
    public static int sortearNoLimite(int limite) {
        Random r = new Random();
        return r.nextInt(limite);
    }

}
