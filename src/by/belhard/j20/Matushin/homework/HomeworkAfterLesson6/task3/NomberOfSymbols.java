package by.belhard.j20.Matushin.homework.HomeworkAfterLesson6.task3;

import java.util.HashMap;
import java.util.Map;

public class NomberOfSymbols {
    String string = "Hfxn dhqf. /qlf ,,.fqf  qwfas";

    Map<Character, Integer> symbols = new HashMap<>();

    public Map NomberofSymbols(String string){
        Map<Character, Integer> symbols = new HashMap<>();
        int nomber;
        for (int i = 0;i< string.length();i++){
            if (symbols.containsKey(string.charAt(i))){
                nomber= symbols.get(string.charAt(i)) + 1;
                symbols.put(string.charAt(i),nomber);

            }
            else {
                symbols.put(string.charAt(i),1);
            }
        }

        return symbols;
    }
}
