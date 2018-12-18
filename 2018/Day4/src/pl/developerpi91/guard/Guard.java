package pl.developerpi91.guard;

import java.util.ArrayList;

public class Guard {
    public final String GUARD_ID;
    public final ArrayList<String> GUARD_SCHEDULE;

    public Guard(String GUARD_ID, ArrayList<String> GUARD_SCHEDULE ) {
        this.GUARD_ID = GUARD_ID;
        this.GUARD_SCHEDULE = GUARD_SCHEDULE;
    }

    public void getGuardAcitviti(){

        for (int currentGuardRecord=0;currentGuardRecord<this.GUARD_SCHEDULE.size();currentGuardRecord++){


        }
    }
    public boolean isAsleep(String scheduRecord){
        //TODO

    }
}
