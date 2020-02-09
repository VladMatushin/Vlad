package by.belhard.j20.Matushin.lessons.Homework.MomeworkAfterLesson4.ThirdTask;

public class Serial {
    String name;
    Type type;
    int nomberofseries = 0;
    TimeCode timecode;
    public void SetWereIEnded(int nomber, int hour, int min, int sec) {
        if (min >= 60) {
            hour += min / 60;
            min = min % 60;
        }
        if (sec >= 60) {
            min += sec / 60;
            sec = sec % 60;
        }
        this.nomberofseries = nomber;
        timecode.hour = hour;
        timecode.min = min;
        timecode.sec = sec;
    }
        public void getWereIEnded() {
            System.out.println("Nomber of series - " + nomberofseries + "Time code is - " + timecode.hour + "." + timecode.min + "." + timecode.sec);
        }
        public  void  Description(){
        if (nomberofseries > 0)
            System.out.println("This serial is cold " + name +", it is a " + type + "Serial. Yoy didn't watch it.");
        else
            System.out.println("This serial is cold " + name +", it is a " + type + "Serial. Last serias you watched is " + nomberofseries);
        }

    }






