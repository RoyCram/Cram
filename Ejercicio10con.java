package ejercicios;

public class Ejercicio10con {

    public static int Ejercicio10con(int[] array, int indice, int maximoActual) {
        if (indice < array.length) {
            if (array[indice] > maximoActual) {
                maximoActual = array[indice];
            }
            return Ejercicio10con(array, indice + 1, maximoActual);
        }
        return maximoActual;
    }
    public static void main(String[] args) {
        int[] array = { 7, 11, 5, 9, 15, 17 };
        int maximo = Ejercicio10con(array, 0, Integer.MIN_VALUE);
        System.out.println("El máximo número del array es: " + maximo);
    }
    
}
