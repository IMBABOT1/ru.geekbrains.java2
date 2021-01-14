package Lesson2;

import Lesson1.Participants.Participant;

import java.util.Arrays;

public class MyArrayDataException extends Exception {
    private String[][] arr;
    private int i;
    private int j;


    public MyArrayDataException(String[][] arr, int i, int j) {
        super(String.format("Arrays contains not digit values in indexes [%d][%d]", + i, j));
        this.arr = arr;
        this.i = i;
        this.j = j;
    }
}

