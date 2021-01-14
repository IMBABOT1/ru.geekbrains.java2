package Lesson1.Participants;

public class Cat implements Participant {


    private final int MAXRUN = 800;
    private final int MAXJUMP = 800;

    public boolean distance = true;


    @Override
    public void run(int run) {
        if (MAXRUN >= run && distance == true){
            System.out.println("Кот пробежал: " + run);
        }else if (MAXRUN < run && distance == true){
            System.out.println("Кот cошел с дистанции: " + run);
            distance = false;
            return;
        }
    }

    @Override
    public void jump(int height) {
        if (MAXJUMP >= height && distance == true){
            System.out.println("Кот прыгнул: " + height);
        }else if (MAXJUMP < height && distance == true){
            System.out.println("Кот cошел с дистанции: " + height);
            distance = false;
            return;
        }
    }

    @Override
    public void info(){
        if (distance == true){
            System.out.println("Кот успешно закончил дистанцию");
        }else {
            System.out.println("Кот не смог закончить дистанцию");
        }
    }
}


