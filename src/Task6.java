public class Task6 {
    public static void main (String args []){
        int a = 6;
        int b = 5;
        int c = 7;

        boolean equalA = a==b | a==c;
        boolean equalB = b==a | b==c;
        boolean equalC = c==a | c==b;

        System.out.println("a равно хоть одному числу: " + equalA);
        System.out.println("b равно хоть одному числу: " + equalB);
        System.out.println("c равно хоть одному числу: " + equalC);

        boolean maxA = a>b | a>c;
        boolean maxB = b>a | b>c;
        boolean maxC = c>a | c>b;

        System.out.println("a больше хоть одного числа: " + maxA);
        System.out.println("b больше хоть одного числа: " + maxB);
        System.out.println("c больше хоть одного числа: " + maxC);
    }
}
