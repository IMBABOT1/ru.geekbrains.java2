package Lesson5;


import java.util.Arrays;

public class Main {


    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];
    private static long time = 0;


    private static long method1(){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }


        return time = System.currentTimeMillis() - a;
    }


    private static long method2() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        float[] first = new float[h];
        float[] second = new float[h];

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, first, 0, h);
        System.arraycopy(arr, h, second, 0, h);

        Thread thread = new Thread(new MyThread(first, 0));
        Thread thread1 = new Thread(new MyThread(second, h));
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.arraycopy(first, 0, arr, 0, h);
        System.arraycopy(second, 0, arr, h, h);

       return time = System.currentTimeMillis() - a;
    }



    public static void main(String[] args) {
        System.out.println(method1());
        System.out.println(method2());
    }
}
