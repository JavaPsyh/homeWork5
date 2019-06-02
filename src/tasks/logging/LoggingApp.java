package tasks.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggingApp {

    private static void configureLogging() {

        Logger tasks = Logger.getLogger("org.stepic.java");
        tasks.setLevel(Level.ALL);
        ConsoleHandler tasksHandler = new ConsoleHandler();
        tasksHandler.setLevel(Level.ALL);
        tasks.addHandler(tasksHandler);
        XMLFormatter xmlFormatterTasks = new XMLFormatter();
        tasksHandler.setFormatter(xmlFormatterTasks);

        Logger rootLogger = Logger.getLogger("");
        rootLogger.setLevel(Level.OFF);
        tasks.setParent(rootLogger);
        tasks.setUseParentHandlers(false);

        Logger classA = Logger.getLogger("org.stepic.java.logging.ClassA");
        classA.setLevel(Level.ALL);
        classA.setParent(tasks);
        classA.setUseParentHandlers(true);


        Logger classB = Logger.getLogger("org.stepic.java.logging.ClassB");
        classB.setLevel(Level.WARNING);
        classB.setParent(tasks);
        classB.setUseParentHandlers(true);


    }

    public static void main(String[] args) {

    }

}
