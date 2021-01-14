package Lesson1.Participants;


public class Human implements Participant {



    private final int MAXRUN = 300;
    private final int MAXJUMP = 300;

    public boolean distance = true;



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


