package ejercicios;

public class Ejercicio1 {
    
    public static int Ejercicio1(int n){
        if (n == 1) {
            return 1;
        } else {
            return n + Ejercicio1(n - 1);
        }
    }
    public static void main(String[] args) {
        int N = 5; 
        int resultado = Ejercicio1(N);
        System.out.println("La suma de los números naturales hasta " + N + " es: " + resultado);
    }
}

