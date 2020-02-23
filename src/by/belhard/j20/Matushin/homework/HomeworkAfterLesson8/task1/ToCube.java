package by.belhard.j20.Matushin.homework.HomeworkAfterLesson8.task1;

import java.io.*;

public class ToCube {
    public static void main(String[] args) {


        String pathIn = "Input.txt";
        String pathOut = "Output.txt";
        File fileIn = new File(pathIn);
        File fileOut = new File(pathOut);

        try (Reader input = new FileReader(fileIn);
             Writer output = new FileWriter(fileOut)) {
            int readByte;
            StringBuilder nombers = new StringBuilder();
            while ((readByte = input.read()) != -1) {
                nombers.append((char) readByte);
            }
            double nomer;
            for (String nom: nombers.toString().split(" ")) {
                nomer = Math.pow(Integer.parseInt(nom),3);
                output.write((int) nomer + " ");
            }

        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}