package by.belhard.j20.Matushin.lessons.lesson_4;

public class Person {
    private  static final String error_name = "Vasiliy";

    private String name;

    int age;

    protected Country country;

    public Sex sex;

    public Person (String name, Country country) {
        //this.(name, 18, country, MALE);
    }

    public static String captalise(String string){
        return string.toUpperCase();
    }

    public Person(String name, int age, Country country, Sex sex) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.sex = sex;
    }

    private  Person (){
    }

    public void walk (){
        System.out.println(name + "Is walking");
    }

    public  void eat(String dish){
        int a;
        System.out.printf("He is eating smth", name, dish);
    }

    public int GrowOld(){
        return ++age;
    }

    public void setName(String name) {

        if(name.length()<2)
            name = error_name;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Country getCountry() {
        return country;
    }

    public Sex getSex() {
        return sex;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country=" + country +
                ", sex=" + sex +
                '}';
    }
}
