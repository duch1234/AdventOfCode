package pl.developerpi91.day7;

import java.util.regex.Pattern;

public class RegexHelper {


    private final static String STEP = "[sS]tep.(\\w)";
    private final static String STEP_FINISHED = "Step (\\w) must be finished";
    private final static String STEP_TODO = "step (\\w) can begin";

    public static Pattern step = Pattern.compile(STEP);
    public static Pattern stepFinished = Pattern.compile(STEP_FINISHED);
    public static Pattern stepToDo = Pattern.compile(STEP_TODO);


}
