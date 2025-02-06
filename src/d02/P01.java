package d02;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.print("Escribe tu número ");
        int n1=entrada.nextInt();
        System.out.print("Escribe otro número");
        int n2=entrada.nextInt();
        System.out.println("Es 1er número es "+n1+" y el otro "+n2);
        int suma=n1+n2;
        System.out.println("La suma es "+suma);
    }
}
