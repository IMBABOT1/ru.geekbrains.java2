package Lesson1;

import Lesson1.Obstacles.Obstacles;

import Lesson1.Obstacles.Racetrack;
import Lesson1.Obstacles.Wall;
import Lesson1.Participants.Cat;
import Lesson1.Participants.Human;
import Lesson1.Participants.Participant;
import Lesson1.Participants.Robot;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Robot robot = new Robot();
        Human human = new Human();
        Wall wall = new Wall(20);
        Racetrack racetrack = new Racetrack(30);
        Racetrack racetrack1 = new Racetrack(40);
        Racetrack racetrack2 = new Racetrack(40);


        Participant[] participants = new Participant[3];
        participants[0] = cat;
        participants[1] = robot;
        participants[2] = human;

        Obstacles[] obstacles = new Obstacles[4];
        obstacles[0] = racetrack;
        obstacles[1] = wall;
        obstacles[2] = wall;
        obstacles[3] = racetrack1;


//        wall.doIt(cat);
//        wall.doIt(human);
//        wall.doIt(robot);
//
//        racetrack.doIt(cat);
//        racetrack.doIt(human);
//        racetrack.doIt(robot);

        for (Participant p : participants){
            for (Obstacles o : obstacles){
                    o.doIt(p);
            }
        }

        for (Participant p : participants){
            p.info();
        }

    }
}


