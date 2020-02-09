package by.belhard.j20.Matushin.lessons.Homework.MomeworkAfterLesson4.SecondTask;

public class Plaer {
    int x,y;
    int rast = 0;

    public void setXY(int x, int y) {
        rast += (this.x - x)*(this.x - x) + (this.y - y)*(this.y - y);
        this.x = x;
        this.y = y;
    }

    public void ShowXY() {
        System.out.println("x = " + x + ", y = " + y);
    }
    public void HowLong(){
        System.out.println("This player walked " + rast + "meters");
    }
}
