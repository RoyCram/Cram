package ejercicios;

public class Ejercicio10sin {

    public static int Ejercicio10sin(int[] array, int indice) {
        if (indice == array.length - 1) {
            return array[indice];
        }
        int maxRestante = Ejercicio10sin(array, indice + 1);
        return Math.max(array[indice], maxRestante);
    }
    public static void main(String[] args) {
        int[] array = { 7, 11, 5, 9, 15, 17 };
        int maximo = Ejercicio10sin(array, 0);
        System.out.println("El máximo número del array es: " + maximo);
    }
    
}
