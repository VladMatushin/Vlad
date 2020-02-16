package by.belhard.j20.Matushin.homework.HomeworkAfterLesson6.task1;

public class Person {
        private Pet pet;

    public void PlayWithAnyPet(Pet pet){
        switch (pet){
            case CAT:
                System.out.println("Cat meows");
                break;
            case DOG:
                System.out.println("Dog barks and jumps");
                break;
            case FISH:
                System.out.println("Fish swims around");
            default:
                System.out.println("You have no pet to play");
        }
    }

    public void PlayWithMyPet(){
        switch (pet){
            case CAT:
                System.out.println("Cat meows");
                break;
            case DOG:
                System.out.println("Dog barks and jumps");
                break;
            case FISH:
                System.out.println("Fish swims around");
            default:
                System.out.println("You have no pet to play");
        }

    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
