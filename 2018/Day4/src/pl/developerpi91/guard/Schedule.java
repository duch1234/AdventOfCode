package pl.developerpi91.guard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Schedule {

    private RegexPattern p = new RegexPattern();

    public static ArrayList<String> scheduleTable = new ArrayList<>();
    public static Set<String> guardList;


    public Schedule(ArrayList<String> schedule) {
        Collections.sort(schedule);
        this.scheduleTable = schedule;
        getAllGuardsID();
    }

    public String getGuardID(String scheduleRecord){

        Matcher guardID = p.guardID.matcher(scheduleRecord);
        if(guardID.find()){
            return guardID.group();
        }else {
            return "";
        }
    }
    public void getAllGuardsID(){
        ArrayList<String> temporaryGuardList = new ArrayList<>();
        for (String currentScheduleRecord:this.scheduleTable) {
            if(getGuardID(currentScheduleRecord) != ""){
                temporaryGuardList.add(getGuardID(currentScheduleRecord));
            }
            this.guardList = new HashSet<String>(temporaryGuardList);
        }
    }

    public String getWhoIsOnShift(int currentScheduleRecord){
        while (true){
            if (getGuardID(scheduleTable.get(currentScheduleRecord)) != ""){
                return getGuardID(scheduleTable.get(currentScheduleRecord));
            } else {
                currentScheduleRecord--;
            }
        }
    }


    public ArrayList<String> getScheduleForGuard(String guardID){
        ArrayList<String> guardSchedule = new ArrayList<>();

        for (int currentScheduleRecord=0;currentScheduleRecord<scheduleTable.size();currentScheduleRecord++) {
            if(guardID.equals(getWhoIsOnShift(currentScheduleRecord))){
                guardSchedule.add(scheduleTable.get(currentScheduleRecord));
            }
        }
        return  guardSchedule;
    }


}
