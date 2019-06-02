package tasks.robot;

public class TryCatchRobot {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection connection = null;
        int counter = 3;

        for (int i = 0; i < counter; i++) {
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException rce) {
                if (i == 2) {
                    throw new RobotConnectionException("Ups! Three connections were failed.");
                } else {
                    continue;
                }
            } finally {
                try {
                    if (connection != null)
                        connection.close();
                } catch (Throwable ta) {

                }
            }
        }

    }
}
