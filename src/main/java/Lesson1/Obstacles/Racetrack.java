package Lesson1.Obstacles;

import Lesson1.Participants.Participant;

public class Racetrack implements Obstacles {

    public int getRace() {
        return race;
    }

    private int race = 200;


    @Override
    public void doIt(Participant participant){
         participant.run(race);
    }
}

