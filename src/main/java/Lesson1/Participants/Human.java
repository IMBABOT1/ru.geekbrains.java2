package Lesson1.Participants;

import Lesson1.Obstacles.Racetrack;
import Lesson1.Obstacles.Wall;

public class Human implements Participant {


    private final int MAXRUN = 200;
    private final int MAXJUMP = 200;
    private boolean runDistance;
    private boolean jumpDistance;

    Wall wall = new Wall(100);
    Racetrack racetrack = new Racetrack(250);


    public boolean isDistance() {
        return distance;
    }

    private boolean distance;




    public Human(){
        runDistance = false;
        jumpDistance = false;
    }


    @Override
    public boolean run() {
        if (MAXRUN < racetrack.getRace()){
            System.out.println("Человек сошел с дистанции: " + racetrack.getRace());
            runDistance = false;
        }else if (MAXRUN > racetrack.getRace()){
            System.out.println("Человек прошел: " + racetrack.getRace());
            runDistance = true;
        }

        return runDistance;
    }

    @Override
    public boolean jump() {
        if (MAXJUMP < wall.getHeight()){
            System.out.println("Человек не смог прыгнуть: " + wall.getHeight());
            jumpDistance = false;
        }else if (MAXJUMP > wall.getHeight()){
            System.out.println("Человек прыгнул" + wall.getHeight());
            jumpDistance = true;
        }

        return jumpDistance;
    }

    @Override
    public boolean isOnDistance(){
        if  (run() && jump()){
            distance = true;
            System.out.println("Человек прошел полосу препятствий");
        }else {
            System.out.println("Человек не прошел полосу препятствий");
            distance = false;
        }
        return distance;
    }
}
