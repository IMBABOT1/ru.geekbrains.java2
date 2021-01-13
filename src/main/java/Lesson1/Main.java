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
        Wall wall = new Wall(100);
        Racetrack racetrack = new Racetrack(100);


        Participant[] participants = new Participant[3];
        participants[0] =  cat;
        participants[1] = robot;
        participants[2] = human;

        Obstacles[] obstacles = new Obstacles[3];
        obstacles[0] = wall;
        obstacles[1] = racetrack;
        obstacles[2] = racetrack;

        int i = 0;
        for (Obstacles o : obstacles) {
            while (i < obstacles.length) {
                if (o.doIt(participants[i])) ;
                i++;
            }
        }
    }
}
