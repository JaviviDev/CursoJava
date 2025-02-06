package d02;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Escribe tu número ");
        float n1=entrada.nextFloat();
        System.out.print("Escribe otro número ");
        float n2=entrada.nextFloat();
        System.out.println("Es 1er número es "+n1+" y el otro "+n2);
        float suma=n1+n2;
        System.out.println("La suma es "+suma);
    }
}
