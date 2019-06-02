package tasks.logging;

import java.util.logging.Filter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingA {
    private static final Logger LOGGER = Logger.getLogger(LoggingA.class.getName());
    static {
        LOGGER.setLevel(Level.ALL);
    }
}
