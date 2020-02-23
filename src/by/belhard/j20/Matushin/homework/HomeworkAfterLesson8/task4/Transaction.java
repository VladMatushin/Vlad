package by.belhard.j20.Matushin.homework.HomeworkAfterLesson8.task4;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Transaction {
    public static void main(String[] args) {
        String pathIn1 = "balance.dt";
        String pathIn2 = "transactions.dt";

        File fileIn1 = new File(pathIn1);
        File fileIn2 = new File(pathIn2);

        String file1 = null;
        try {
            file1 = new String(Files.readAllBytes(Paths.get(pathIn1)));
        }catch (IOException e){
            e.printStackTrace();
        }

        Map<String,Integer> people = new HashMap<>();

        String last = null;

        for (String nom: file1.split(" ")){
            if (Integer.parseInt(nom) == 0){
                last = nom;
            }else{
                people.put(last,Integer.parseInt(nom));
            }


        }

        }



}
