package ejercicios;

public class Ejercicio6 {
    
    public static int Ejercicio6(int numero, int resultado) {
        if (numero == 0) {
            return resultado;
        } else {
            int digito = numero % 10;
            int nuevoResultado = resultado * 10 + digito;
            return Ejercicio6(numero / 10, nuevoResultado);
        }
    }
    public static void main(String[] args) {
        int numeroOriginal = 746249;
        int numeroInvertido = Ejercicio6(numeroOriginal, 0);
        System.out.println("Número original: " + numeroOriginal);
        System.out.println("Número invertido: " + numeroInvertido);
    } 
}
    

