package Lesson5;

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

    }
}
