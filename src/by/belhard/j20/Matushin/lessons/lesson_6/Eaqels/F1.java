package by.belhard.j20.Matushin.lessons.lesson_6.Eaqels;

import java.util.Objects;

public abstract class F1 implements Comparable<F1> {
    private int x;
    private String y;

    public int getX() {
        return x;
    }

    public String getY() {
        return y;
    }

    public F1(int x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        F1 F1 = (F1) o;
        return x == F1.x &&
                Objects.equals(y, F1.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
