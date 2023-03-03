package week3.week4;

public class T3AnalyzeCode {

    public static void main(String[] args) {

        int a = 8;
        int b = a--;

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------");

        float speed = 20.5f;

        byte num1 = (byte) speed;
        short num2 = (short) speed;
        int num3 = (int) speed;
        long num4 = (long) speed;
        float num5 = speed;
        double num6 = speed;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

    }
}
