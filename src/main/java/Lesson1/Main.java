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
        Wall wall = new Wall(100000);
        Racetrack racetrack = new Racetrack(100000);


        Participant[] participants = new Participant[3];
        participants[0] = cat;
        participants[1] = robot;
        participants[2] = human;

        Obstacles[] obstacles = new Obstacles[3];
        obstacles[0] = racetrack;
        obstacles[1] = wall;
        obstacles[2] = wall;


//        wall.doIt(cat);
//        wall.doIt(human);
//        wall.doIt(robot);
//
//        racetrack.doIt(cat);
//        racetrack.doIt(human);
//        racetrack.doIt(robot);

        for (Obstacles o : obstacles){
            for (Participant p : participants){
                o.doIt(p);
            }
        }

        for (Participant p : participants){
            p.info();
        }

    }
}


