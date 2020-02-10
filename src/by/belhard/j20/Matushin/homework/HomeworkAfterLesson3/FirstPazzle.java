package by.belhard.j20.Matushin.homework.HomeworkAfterLesson3;

public class FirstPazzle {
    public static void main(String[] args) {
        int i = 10;
        while (i <=99){
            if ((i % 20) % 19 == 0)
                i+=11;
            else
                i+=1;
            if (i >99)
                break;
            if (((i % 5 == 0) && (i % 7 != 0) || (i % 5 != 0) && (i % 7 == 0))){
                System.out.println(i + " ");
            }
        }
    }
}
