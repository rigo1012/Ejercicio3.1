package Numeros;

import java.util.Scanner;

public class MayorMenor {
    public  static void main (String[] args){
        Scanner abc=new Scanner(System.in);
        float num, nume, numero;
        System.out.println("NUMEROS ORDENADOS");
        System.out.println("Ingrese tres numeros");
        num= abc.nextFloat();
        nume= abc.nextFloat();
        numero=abc.nextFloat();

        if(num>nume){
            if(num>numero){
                System.out.println("Numero mayor es" + num);
                if(nume>numero){
                    System.out.println("Intermedio es" + nume);
                    System.out.println("Menor es"+ numero);
                }else{
                    System.out.println("Numero mayor es" + num);
                    System.out.println("Intermedio es" + numero);
                    System.out.println("Menor es" + nume);
                }
            }else{
                System.out.println("Numero mayor es" + numero);
                System.out.println("Intermedio es" + num);
                System.out.println("Menor es" + nume);
            }
        }else{
          if(nume>numero){
              System.out.println("Numero mayor es" + nume);
              System.out.println("Intermedio es" + numero);
              System.out.println("Menor es" + num);
          }else{
              System.out.println("El numero mayor es" + numero);
              System.out.println("Intermedio es" + nume);
              System.out.println("El menor es" + num);
          }
        }
    }
}
