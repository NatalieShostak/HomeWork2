import java.util.Scanner;

public class Task2 {
    public static void main (String args []) {

        Scanner sc = new Scanner (System.in);

        System.out.println ("Введите ширину прямоугольника:");
        int a = sc.nextInt();

        System.out.println ("Введите длину прямоуголькина:");
        int b = sc.nextInt();

        int c = a*b;
        System.out.println("Площадь прямоугольника = " + c);

    }
}

