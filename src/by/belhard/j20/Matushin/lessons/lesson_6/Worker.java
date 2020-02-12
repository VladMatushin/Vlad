package by.belhard.j20.Matushin.lessons.lesson_6;

public class Worker extends Person {

        private String factory;

        public  Worker(String name, int age, String factory){
            super(name,age);

            this.factory = factory;
        }

        public void notdowork(){}

    @Override
    public String toString() {
        return "Worker{" + super.toString() +
                "factory='" + factory + '\'' +
                '}';
    }
    public void  dowork(){
        System.out.println(getName() + " Is working hard");
    }
}
