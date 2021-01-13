package Lesson1.Participants;
import Lesson1.Obstacles.Racetrack;
import Lesson1.Obstacles.Wall;

public class Cat implements Participant {


    private final int MAXRUN = 300;
    private final int MAXJUMP = 300;
    private boolean runDistance;
    private boolean jumpDistance;

    Wall wall = new Wall(200);
    Racetrack racetrack = new Racetrack(200);


    public boolean isDistance() {
        return distance;
    }

    private boolean distance;


    public Cat(){
        runDistance = false;
        jumpDistance = false;
    }


    @Override
    public boolean run() {
        if (MAXRUN < racetrack.getRace()){
            System.out.println("Кот сошел с дистанции: " + racetrack.getRace());
            runDistance = false;
        }else if (MAXRUN > racetrack.getRace()){
            System.out.println("Кот прошел: " + racetrack.getRace());
            runDistance = true;
        }

        return runDistance;
    }

    @Override
    public boolean jump() {
        if (MAXJUMP < wall.getHeight()){
            System.out.println("Кот не смог прыгнуть: " + wall.getHeight());
            jumpDistance = false;
        }else if (MAXJUMP > wall.getHeight()){
            System.out.println("Кот прыгнул" + wall.getHeight());
            jumpDistance = true;
        }

        return jumpDistance;
    }

    @Override
    public boolean isOnDistance(){
        if  (run() && jump()){
            distance = true;
            System.out.println("Кот прошел полосу препятствий");
        }else {
            System.out.println("Кот не прошел полосу препятствий");
            distance = false;
        }
        return distance;
    }
}
