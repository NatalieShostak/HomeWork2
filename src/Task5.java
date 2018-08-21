public class Task5 {
    public static void main (String args []){
        int a = 11;
        int b = 10;
        int c = 8;

        boolean MaxA = a>b & a>c;
        boolean MaxB = b>a & b>c;
        boolean MaxC = c>a & c>b;

        System.out.println("a - наибольшее число: " + MaxA);
        System.out.println("b - наибольшее число: " + MaxB);
        System.out.println("c - наибольшее число: " + MaxC);

        boolean MinA = a<b & a<c;
        boolean MinB = b<c & b<a;
        boolean MinC = c<b & c<a;

        System.out.println("a - наименьшее число: " + MinA);
        System.out.println("b - наименьшее число: " + MinB);
        System.out.println("c - наименьшее число: " + MinC);

        boolean MidA = a<b&a>c | a<c&a>b;
        boolean MidB = b<a&b>c | b<c&b>a;
        boolean MidC = c<a&c>b | c>a&c<b;

        System.out.println("a - среднее число: " + MidA);
        System.out.println("b - среднее число: " + MidB);
        System.out.println("c - среднее число: " + MidC);
    }

}
