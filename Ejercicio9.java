package ejercicios;

public class Ejercicio9 {

    public static int Ejercicio9(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero % 10 + Ejercicio9(numero / 10);
        }
    }
    public static void main(String[] args) {
        int numero = 953953485;
        int suma = Ejercicio9(numero);
        System.out.println("Suma de dígitos de " + numero + " es: " + suma);
    }
    
}
