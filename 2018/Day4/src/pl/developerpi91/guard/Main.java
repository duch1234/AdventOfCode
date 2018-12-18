package pl.developerpi91.guard;

public class Main {
    public static void main(String[] args) {

        ImportFromFile iff = new ImportFromFile();
        Schedule schedule = new Schedule(iff.importedFile);

        System.out.println(schedule.scheduleTable.toString());
        System.out.println(schedule.guardList);
        System.out.println(schedule.getWhoIsOnShift(2));
        System.out.println(schedule.getScheduleForGuard("#2953"));


    }
}
