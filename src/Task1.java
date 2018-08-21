import java.util.Scanner;

public class Task1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число A:");
        float A = sc.nextFloat();
        System.out.println("Введите число B:");
        float B = sc.nextFloat();

        float X = A + B;
        System.out.println(A + " + " + B + " = " + X);
    }
}