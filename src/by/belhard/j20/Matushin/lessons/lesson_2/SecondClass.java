package by.belhard.j20.Matushin.lessons.lesson_2;

public class SecondClass {
    public static void main(String[] args) {
        byte b1 = 2;
        byte b2;
        b2 = 127;
        // byte b3 = b1 + b2;
        byte b3 = (byte) (b1 + b2);
        long b4 = 2000000000000000000L;
        float b5 = 2.1f;
        System.out.println(b3);
        char c1 = 'A';
        char c2 = 99;
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((char)('a' + 2));
        System.out.println("b1 = " + b1);
        int a = 1;
        System.out.println(++a);
        a = 1;
        System.out.println(a++);
        System.out.println(b1 == b2);

    }
}
