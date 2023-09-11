package ejercicios;

public class Ejercicio7 {

        public static String Ejercicio7(String palabra) {
        if (palabra.isEmpty()) {
            return "";
        } else {
            char primerCaracter = palabra.charAt(0);
            String restoPalabra = palabra.substring(1);
            return Ejercicio7(restoPalabra) + primerCaracter;
        }
    }
    public static void main(String[] args) {
        String palabraOriginal = "odontologia";
        String palabraInvertida = Ejercicio7(palabraOriginal);
        System.out.println("Palabra original: " + palabraOriginal);
        System.out.println("Palabra invertida: " + palabraInvertida);
    }
    
}
