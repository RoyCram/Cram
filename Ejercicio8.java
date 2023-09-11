package ejercicios;

public class Ejercicio8 {

    public static double Ejercicio8(double base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente > 0) {
            return base * Ejercicio8(base, exponente - 1);
        } else {
            return 1 / (base * Ejercicio8(base, -exponente - 1));
        }
    }
    public static void main(String[] args) {
        double base = 5.0;
        int exponentePositivo = 4;
        int exponenteNegativo = -6;

        double resultadoPositivo = Ejercicio8(base, exponentePositivo);
        double resultadoNegativo = Ejercicio8(base, exponenteNegativo);

        System.out.println(base + " elevado a " + exponentePositivo + " es: " + resultadoPositivo);
        System.out.println(base + " elevado a " + exponenteNegativo + " es: " + resultadoNegativo);
    }  
}
