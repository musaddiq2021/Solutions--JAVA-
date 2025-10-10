public class LogLevels {
    
    public static String message(String logLine){
        String[] x = logLine.split(": ");
        return x[1].trim();    
    }

    public static String logLevel(String logLine) {
        String[] x = logLine.split(": ");
        String level = x[0];
        level = level.replace("[", "");
        level = level.replace("]", "");
        level = level.toLowerCase();
        return level;
    }

    public static String reformat(String logLine) {
        String[] x = logLine.split(": ", 2);
        String lev = x[0];
        String dis = x[1].trim();
        lev = lev.replace("[", "");
        lev = lev.replace("]", "");
        lev = lev.toLowerCase();
        return dis + " (" + lev + ")";
        }
}
