package by.belhard.j20.Matushin.lessons.lesson_8.NewTheme;

import java.io.*;

public class BafferedStreamExample {
    public static void main(String[] args) {

        String pathIn = "Input.tt";
        String pathOut = "Output.tt";

        File fileIn = new File(pathIn);
        File fileOut = new File(pathOut);


        try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
            BufferedWriter output = new BufferedWriter(new FileWriter(fileOut));
            int readByte;
            while ((readByte = input.read()) != -1){
                System.out.println((char)readByte);
                output.write((char) readByte);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
