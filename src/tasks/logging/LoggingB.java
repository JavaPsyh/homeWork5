package tasks.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingB {
    private static final Logger LOGGER = Logger.getLogger(LoggingB.class.getName());

    static {
        LOGGER.setLevel(Level.WARNING);
    }
}
