import java.util.Scanner;

public class Task3 {
    public static void  main (String args []){
        Scanner sc = new Scanner (System.in);

        System.out.println("Введите длину первой стороны треугольника");
        int a = sc.nextInt();

        System.out.println("Введите длину второй стороны треугольника");
        int b = sc.nextInt();

        System.out.println("Введите длину третей стороны треугольника");
        int c = sc.nextInt();

        double p = ((a+b+c/2));
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("Площадь прямоугольника равна " + S);
    }
}
