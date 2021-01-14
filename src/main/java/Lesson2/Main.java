package Lesson2;

import java.util.Arrays;

public class Main {

    private static int stringArr(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int result = 0;
        int start = 0;
        int end = 100;

        if (arr.length !=4 || arr[0].length != 4 || arr.length == 0){
            throw new MyArraySizeException(arr);
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
               arr[i][j] =  String.valueOf(start + (int) (Math.random() * end));
            }
        }
       // arr[0][0] = "s";
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].matches("[a-zA-Z]+")){
                    throw new MyArrayDataException(arr, i, j);
                }
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (!arr[i][j].matches("[a-zA-Z]+")){
                    result += Integer.parseInt(arr[i][j]);
                }
            }
        }
        return result;
    }



    public static void main(String[] args) {
        String arr[][] = new String[4][4];
        try {
            System.out.println(stringArr(arr));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
        }

    }
}
