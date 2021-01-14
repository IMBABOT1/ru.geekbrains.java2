package Lesson1.Participants;



public class Robot implements Participant {


    private final int MAXRUN = 600;
    private final int MAXJUMP = 600;

    public boolean distance = true;


    @Override
    public void run(int run) {
        if (MAXRUN >= run && distance == true){
            distance = true;
            System.out.println("Робот пробежал: " + run);
        }else if (MAXRUN < run && distance == true){
            System.out.println("Робот cошел с дистанции: " + run);
            distance = false;
            return;
        }
    }

    @Override
    public void jump(int height) {
        if (MAXJUMP >= height && distance == true){
            System.out.println("Робот прыгнул: " + height);
        }else if (MAXJUMP < height && distance == true){
            System.out.println("Робот cошел с дистанции: " + height);
            distance = false;
            return;
        }
    }

    @Override
    public void info(){
        if (distance == true){
            System.out.println("Робот успешно закончил дистанцию");
        }else {
            System.out.println("Робот не смог закончить дистанцию");
        }
    }
}


