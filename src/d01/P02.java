package d01;

public class P02 {
    public static void main(String[] args){
        int num1 = 9;
        float num2=5.2F;
        char letra= 'a';
        String saludo= "hola, qué tal?";
        boolean acierto=true;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(letra);
        System.out.println(saludo);
        System.out.println(acierto);

        // conversión explícita o "casting"
        num1 = (int)num2;
        System.out.println(num1);
    }
}
