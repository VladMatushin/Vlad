package by.belhard.j20.Matushin.homework.HomeworkAfterLesson8.task2;

import java.io.*;

public class GoToShop {
    public static void main(String[] args) {

        double sum = 0;

        try (BufferedReader rdr = new BufferedReader(new InputStreamReader(System.in))){
             String number = rdr.readLine();
             int nomer = Integer.parseInt(number);
            String inputString = "";
             for (int i = 0;i<nomer;i++){

                inputString = rdr.readLine();

                String[] splitted = inputString.split(" ");

                sum += Double.parseDouble(splitted[1])*Integer.parseInt(splitted[2]);


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(sum);

    }
}
