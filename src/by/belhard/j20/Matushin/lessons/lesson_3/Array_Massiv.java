package by.belhard.j20.Matushin.lessons.lesson_3;

public class Array_Massiv {
    public static void main(String[] args) {
        int[] array = new int[5];
        //нумерация от 0 до 4;
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        System.out.println(array[3]);
        //System.out.println(array[5]); //скомпелируется, но это ошибка
        for (int i = 0;i<5;i++)
            array[i] *=2;
        for (int i = 0;i<5;i++)
            System.out.println(array[i]);
        String[] mas = {"One", "Two","Three","Four"};
        for (String s: mas){
            if (s.equals("Three"))
                System.out.println("Three");
        }
    }
}
