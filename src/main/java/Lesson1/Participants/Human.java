package Lesson1.Participants;


public class Human implements Participant {



    private int MAXRUN;
    private int MAXJUMP;

    public boolean distance;

    public Human(){
        distance = true;
        MAXRUN = 300;
        MAXJUMP = 300;
    }



    @Override
    public void run(int run) {
        if (MAXRUN >= run && distance == true){
            distance = true;
            System.out.println("Человек пробежал: " + run);
        }else if (MAXRUN < run && distance == true){
            System.out.println("Человек cошел с дистанции: " + run);
            distance = false;
            return;
        }
    }

    @Override
    public void jump(int height) {
        if (MAXJUMP >= height && distance == true){
            System.out.println("Человек прыгнул: " + height);
        }else if (MAXJUMP < height && distance == true){
            System.out.println("Человек cошел с дистанции: " + height);
            distance = false;
            return;
        }
    }

    @Override
    public void info(){
        if (distance == true){
            System.out.println("Человек успешно закончил дистанцию");
        }else {
            System.out.println("Человек не смог закончить дистанцию");
        }
    }
}


