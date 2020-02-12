package by.belhard.j20.Matushin.lessons.lesson_6;

public class Main {
    public static void main(String[] args) {
        //Person person = new Person("Vasiliy",25);
        //person.dowork();

        Worker worker = new Worker("Roma",34,"MTZ");
        worker.dowork();

        Person person2 = worker;

        Person person3 = new Worker("Nikita",56,"MTZ");
        person3.dowork();
    }
}
