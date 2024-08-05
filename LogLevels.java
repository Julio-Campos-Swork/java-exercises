/*
 * full information
 * https://exercism.org/tracks/java/exercises/log-levels
 * 
 */


public class LogLevels {
    public static String message(String logLine) {
        String[] parts = logLine.split(":");
        return parts[1].trim();
    }

    public static String logLevel(String logLine) {
        String[] parts = logLine.split(":");
        return parts[0].toLowerCase().replace('[', ' ').replace(']', ' ').trim();
    }

    public static String reformat(String logLine) {
        
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }


    public static void main(String[] args) {
        System.out.println(LogLevels.message("[ERROR]: Invalid operation")); // => "Invalid operation"
        System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));
        System.out.println(LogLevels.reformat("[ERROR]: Invalid operation"));
    }
}

/*
 * ANOTHER SOLUTIONS
 * public static String message(String logLine) {
        return logLine.split("]: ")[1]
                .trim();
    }
    public static String logLevel(String logLine) {
        return logLine.split("]: ")[0]
                .substring(1)
                .toLowerCase();
    }
    public static String reformat(String logLine) {
        return format("%s (%s)", message(logLine), logLevel(logLine));
    }
 * 
 * 
 */
