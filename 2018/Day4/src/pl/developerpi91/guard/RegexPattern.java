package pl.developerpi91.guard;

import java.util.regex.Pattern;

public class RegexPattern {
    private static final String GUARD_ID = "(#\\w+)";
    private static final String DATE_FORMAT = "(\\d\\d\\d\\d-\\d\\d-\\d\\d)";
    private static final String TIME_FORMAT = "(\\d\\d:\\d\\d)";
    private static final String SLEEP = "(falls asllep)";
    private static final String WAKE_UP = "(wakes up)";


    public static Pattern guardID = Pattern.compile(GUARD_ID);
    public static Pattern dateFormat = Pattern.compile(DATE_FORMAT);
    public static Pattern timeFormat = Pattern.compile(TIME_FORMAT);
    public static Pattern sleep = Pattern.compile(SLEEP);
    public static Pattern wakeUp = Pattern.compile(WAKE_UP);

}
