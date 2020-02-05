package by.belhard.j20.Matushin.lessons.lesson_3;

public class ArrayDvumern {
    public static void main(String[] args) {
        int[][] arr2 = new int [3][];
        arr2[0] = new int [3];
        arr2[1] = new int []{4,5};
        arr2[2] = new int [1];
        byte [][] arr = {{1,2,3},{4,5,6}};
        System.out.println(arr[1][2]);
        int [][] multiTable = new int [10][10];
        for (int i = 1; i<11 ;i++)
            for (int j = 1; j<11 ;j++)
                multiTable[i - 1][j - 1] = i * j;

         //for (int[] ar : multiTable)
         //   for (int i : multiTable[0])
         //       System.out.print(multiTable[i][i] + " ");
         //   System.out.println();


            }
    }

