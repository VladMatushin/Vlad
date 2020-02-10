package by.belhard.j20.Matushin.lessons.lesson_5.task1;

public class Wardrobe {

    private  int shelves;

    private  final String[] items;

    public  Wardrobe(int shelves){
        if (shelves < 1){
            shelves = 3;
        }
        this.shelves = shelves;
        this.items = new String[shelves];
    }
    public  void  printinfo(){
        for (int i = 1;i < shelves; i++){
            System.out.printf("%d) %s\n",i,items[i]);
        }
    }
    public String getitem(int n){
        String resoult = null;
        if (n <= 0 || n > shelves){
            System.err.println("Bad input");
            return null;
        }
        if (items[n - 1] == null)
            System.out.println("This shelve is empty");
        else{
            resoult = items[n - 1];
            items[n - 1] = null;
        }
        return resoult;
    }
    //public String getRandomitem(){}

    public  void setitem(String item, int n){
        if (shelves < 1){
            shelves = 3;
        }


    }

}
