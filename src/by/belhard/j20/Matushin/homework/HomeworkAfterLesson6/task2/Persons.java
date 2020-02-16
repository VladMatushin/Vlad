package by.belhard.j20.Matushin.homework.HomeworkAfterLesson6.task2;

import java.util.ArrayList;
import java.util.List;

public class Persons {
    public static void main(String[] args) {
        List<String> persons = new ArrayList<>();
        persons.add("Andrey");
        persons.add("Vania");
        persons.add("Nikita");
        persons.add("Tolik");
        persons.add("Vasia");

    }

    public Object CheckName(String name, ArrayList persons){
        for (int i = 0;i<persons.size();i++){
            if (name ==  persons.get(i)){
                persons.get(i).toString();
                return persons.get(i);
            }
        }
        return null;
    }

}
