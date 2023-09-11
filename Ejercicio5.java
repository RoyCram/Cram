package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
          System.out.print("Introduce un número para calcular: ");
          int limite = sc.nextInt();
          sc.close();
 
          for(int i = 0; i<limite; i++){
               System.out.print(funcionFibonacci(i) + ", ");
          }
     }
 
     private static int funcionFibonacci(int num){
          if(num == 0 || num==1)
               return num;
          else
               return funcionFibonacci(num-1) + funcionFibonacci(num-2);
    } 
}
