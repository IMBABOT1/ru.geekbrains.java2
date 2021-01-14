package Lesson2;

public class MyArraySizeException extends Exception {
    private String[][] arr;

    public MyArraySizeException(String[][] arr) {
        super(String.format("Incorrect size must be 4x4, but: %dx%d", arr.length, arr[0].length));
        this.arr = new String[][]{};
    }
}

