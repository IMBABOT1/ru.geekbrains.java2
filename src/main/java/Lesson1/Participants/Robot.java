package Lesson1.Participants;



public class Robot implements Participant {


    private int MAXRUN;
    private int MAXJUMP;

    public boolean distance;

    public Robot(){
        distance = true;
        MAXRUN = 1;
        MAXJUMP = 1;
    }


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


