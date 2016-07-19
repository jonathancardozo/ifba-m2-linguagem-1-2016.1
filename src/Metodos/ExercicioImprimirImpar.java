package Metodos;


public class ExercicioImprimirImpar {
    
    /*
    Exercício: Crie um método que
    - pede um número inteiro
    - Imprime todos os números impares de 0 até o número informado
    Exemplos:
    n = 5  | 1,3,5
    n = 10 | 1,3,5,7,9
    n = 20 | 1,3,5,6,9,11,13,15,17,19
    */
    
    public static void imprimirImpar(int n) {
        for(int i=0; i<n; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("n=5");
        imprimirImpar(5);
        System.out.println("n=10");
        imprimirImpar(10);
        System.out.println("n=20");
        imprimirImpar(20);
    }
    
}
