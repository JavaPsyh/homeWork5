package tasks.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggingApp {

    private static void configureLogging() {

        Logger loggerA = Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.setLevel(Level.ALL);
        Logger loggerB = Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerB.setLevel(Level.WARNING);
        Logger folder = Logger.getLogger("org.stepic.java");
        folder.setUseParentHandlers(false);
        Handler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        XMLFormatter xmlFormatter = new XMLFormatter();
        handler.setFormatter(xmlFormatter);
        folder.addHandler(handler);

    }

    public static void main(String[] args) {

    }

}
