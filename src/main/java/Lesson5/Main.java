package Lesson5;


import java.util.Arrays;

public class Main {


    private static final int size = 10000000;
    private static final int h = size / 2;
    private static float[] arr = new float[size];
    private static long time = 0;


    private static float[] method1(){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }


        time = System.currentTimeMillis() - a;

        return arr;
    }


    private static float[] method2() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        float[] first = new float[h];
        float[] second = new float[h];

        float[] temp = new float[size];
        for (int i = h; i <temp.length ; i++) {
            temp[i] = 1;
        }

        long a = System.currentTimeMillis();

        System.arraycopy(arr, 0, first, 0, h);
        System.arraycopy(arr, h, second, 0, h);

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <first.length ; i++) {
                    first[i] = (float)(first[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        try {
            t.start();
            t.join();;
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = h; i <temp.length ; i++) {
                    temp[i] = (float)(temp[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        try {
            t1.start();
            t1.join();;
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.arraycopy(first, 0, arr, 0, h);
        System.arraycopy(temp, h, arr, h, h);

        time = System.currentTimeMillis() - a;


        return  arr;
    }



    public static void main(String[] args) {
        System.out.println(Arrays.equals(method1(), method2()));
    }
}
