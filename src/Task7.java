public class Task7 {
    public static void main (String args []){
        System.out.println((char) 27 + "[33mWarning! " + (char)27 + "[0m");

        int a = 15;
        int b = 6;

        int c = 3;
        int d = 1;

        int max = a<b ? b : a;
        int max2 = Math.max(c,d);
        System.out.println(max);
        System.out.println(max2);
    }
}