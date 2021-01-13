package Lesson1.Obstacles;

import Lesson1.Participants.Participant;

public class Racetrack implements Obstacles {

    public int getRace() {
        return race;
    }

    private int race;

    public Racetrack(int race) {
        this.race = race;
    }


    @Override
    public boolean doIt(Participant participant) {
        return participant.isOnDistance();
    }
}

