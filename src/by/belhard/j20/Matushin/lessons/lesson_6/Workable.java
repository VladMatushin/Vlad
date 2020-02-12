package by.belhard.j20.Matushin.lessons.lesson_6;

public interface Workable {

    int permonent = 5;

    void dowork();

    void  notdowork();

    static void  printtime(){
        System.out.println();
    }

    default  String ggg(){
        return "ggg";
    }
}