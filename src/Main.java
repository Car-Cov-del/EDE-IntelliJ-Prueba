import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println("Hola Carlos :)");

        System.out.println("Dime un número");
        num1 = scan.nextInt();

        System.out.println("Dime otro");
        num2 = scan.nextInt();

        if(num1<num2)
            System.out.println("El número mayor es "+num2);

        else
            System.out.println("El número mayor es "+num1);

    }
}