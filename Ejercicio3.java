package ejercicios;

public class Ejercicio3 {
    private int[] vector;
    public Ejercicio3(int[] v) {
        vector = v;
    }

    public void leerVector(int pos){
        if (pos == vector.length-1) { System.out.println("Elemento en posición "+pos + " es "+vector[pos]);}
        else {
            System.out.println("Elemento en posición "+pos + " es "+vector[pos]);
            leerVector(pos+1);
        }
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 8, 1, 9};
        Ejercicio3 miVector = new Ejercicio3(a);
        miVector.leerVector(0);
    }
}
