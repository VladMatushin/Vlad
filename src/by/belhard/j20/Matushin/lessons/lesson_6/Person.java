package by.belhard.j20.Matushin.lessons.lesson_6;

public abstract class Person implements Workable {
    private  String  name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void  dowork(){
        System.out.println(getName() + " Is doing nothing");
    }
    public int GrowOld(){
        return ++age;
    }


}
