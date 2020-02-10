package by.belhard.j20.Matushin.homework.HomeworkAfterLesson3;

public class ThirdPazzle {
    public static void main(String[] args) {
        int[][] mas = new int[5][];
        int intStart = 5;
        for (int i = 0;i < 5;i++)
            mas[i] = new int[i+1];
        for (int i = 0;i < 5;i++)
            for (int j = 0;j < (i+1) ;j++){
                mas [i][j] = intStart;
                intStart*=2;
            }
        for (int i = 0;i < 5;i++) {
            for (int j = i; j >= 0; j--)
                System.out.print(mas[i][j] + " ");
            System.out.println();
        }




    }
}
