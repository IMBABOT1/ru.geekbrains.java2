package Lesson1.Obstacles;

import Lesson1.Participants.Participant;

public class Wall implements Obstacles {

    public int getHeight() {
        return height;
    }

    private int height;


    public Wall(int race) {
        this.height = race;
    }


    @Override
    public boolean doIt(Participant participant) {
        return participant.isOnDistance();
    }
}
