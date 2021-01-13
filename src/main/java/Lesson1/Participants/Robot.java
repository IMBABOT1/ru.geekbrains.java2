package Lesson1.Participants;

import Lesson1.Obstacles.Racetrack;
import Lesson1.Obstacles.Wall;

public class Robot implements Participant {

    private final int MAXRUN = 1;
    private final int MAXJUMP = 1;
    private boolean runDistance;
    private boolean jumpDistance;

    Wall wall = new Wall(50);
    Racetrack racetrack = new Racetrack(105);


    public boolean isDistance() {
        return distance;
    }

    private boolean distance;




    public Robot(){
        runDistance = false;
        jumpDistance = false;
    }


    @Override
    public boolean run() {
        if (MAXRUN < racetrack.getRace()){
            System.out.println("Робот сошел с дистанции: " + racetrack.getRace());
            runDistance = false;
        }else if (MAXRUN > racetrack.getRace()){
            System.out.println("Робот прошел: " + racetrack.getRace());
            runDistance = true;
        }

        return runDistance;
    }

    @Override
    public boolean jump() {
        if (MAXJUMP < wall.getHeight()){
            System.out.println("Робот не смог прыгнуть: " + wall.getHeight());
            jumpDistance = false;
        }else if (MAXJUMP > wall.getHeight()){
            System.out.println("Робот прыгнул" + wall.getHeight());
            jumpDistance = true;
        }

        return jumpDistance;
    }

    @Override
    public boolean isOnDistance(){
        if  (run() && jump()){
            distance = true;
            System.out.println("Робот прошел полосу препятствий");
        }else {
            System.out.println("Робот не прошел полосу препятствий");
            distance = false;
        }
        return distance;
    }
}
