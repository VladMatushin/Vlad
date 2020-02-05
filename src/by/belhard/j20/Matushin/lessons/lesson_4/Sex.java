package by.belhard.j20.Matushin.lessons.lesson_4;

public enum Sex {
    MALE(false),
    FEMALE(false),
    UNKNOWN(true);

    private boolean wasChanged;

    Sex(boolean wasChanged){
        this.wasChanged = wasChanged;
    }
}
