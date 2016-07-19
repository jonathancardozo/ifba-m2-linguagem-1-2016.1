package Metodos;

import java.util.Scanner;

public class ExercicioConverteMetrosCentimetros {
    
    /*
    Crie um método que Converte Metros em Centimetros
    - Pedir um valor em metros (tipo double)
    - Imprimir o valor convertido
    */
    
    public static void main(String[] args) {
        double m = lerNumero();
        metrosParaCm(m);
    }
    
    public static double lerNumero() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite valor em Metros:");
        double m = teclado.nextDouble();
        System.out.println("M = "+m);
        return m;
    }
    
    public static void metrosParaCm(double metros) {
        double cm = metros*100;
        System.out.println("CM = " + cm);
    }
    
    
}
