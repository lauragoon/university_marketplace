package misc.logger;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Object to log important actions.
 * Defines a class to help with proper logging.
 */
public class AppLogger {
    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    /**
     * Constructor.
     */
    public AppLogger() {

    }

    /**
     * Logs message indicating error.
     * @param methodName method causing the error
     * @param msg message
     */
    private static void logInfo(String methodName, String msg){
        String newMsg = "[" + methodName + "()]" + msg ;
        // [fileName()] msg
        LOGGER.log(Level.INFO, newMsg);
    }

    /**
     * Log regular messages
     * @param msg message
     */
    private static void logInfo(String msg){
        LOGGER.log(Level.INFO, msg);
    }

    /**
     * Logs message indicating error.
     * @param methodName method causing the error
     * @param msg message
     */
    private static void logError(String methodName, String msg){
        String newMsg = "[" + methodName + "()]:    " + msg ;
        // [fileName()] msg
        LOGGER.log(Level.WARNING, newMsg);
    }

    /**
     * Logs message indicating error.
     * @param msg message
     */
    private static void logError(String msg) {
        LOGGER.log(Level.WARNING, msg);
    }

    public static void main(String[] args) {
        AppLogger al = new AppLogger();
        al.logError("My name is Ayo");
        al.logInfo("View.start()", "My name is Ayo");
    }

}
