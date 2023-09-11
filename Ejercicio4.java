package ejercicios;

public class Ejercicio4 {

    public static boolean buscarElementoRecursivo(int[] array, int elemento, int indice) {
        if (indice >= array.length) {
                return false;
            }

            if (array[indice] == elemento) {
                return true;
            }

            return buscarElementoRecursivo(array, elemento, indice + 1);
        }
    public static void main(String[] args) {
        int[] array = {4, 12, 34, 7, 22};
        int elementoBuscado = 7;
        
        boolean encontrado = buscarElementoRecursivo(array, elementoBuscado, 0);
        
        if (encontrado) {
            System.out.println("El elemento " + elementoBuscado + " ha sido encontrado en el array.");
        } else {
            System.out.println("El elemento " + elementoBuscado + " no ha sido encontrado en el array.");
        }
    
    }
    
}
