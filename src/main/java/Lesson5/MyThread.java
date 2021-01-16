package Lesson5;

import java.util.Arrays;

public class MyThread implements Runnable {

    private float[] arr;
    private int size = 10000000;
    private int offset = size / 2;


    public MyThread(float[] arr, int offset){
        this.arr = arr;
        this.offset = offset;
    }

    @Override
    public void run() {
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + (i + offset) / 5) * Math.cos(0.2f + (i + offset) / 5) * Math.cos(0.4f + (i + offset) / 2));
        }
    }
}
