package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        int n;
        double factorial = 1;
        Scanner sc = new Scanner(System.in);
		
        do {  
            System.out.print("Introduce un numero: ");
            n = sc.nextInt();
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }	
        System.out.printf("Factorial de %d! = %.0f %n", n, factorial);
    }
    
}
