package tasks.robot;

public class TryCatchRobot {

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        RobotConnection connection = null;

        for (int i = 0; i < 3; i++) {
            try {
                connection = robotConnectionManager.getConnection();
                connection.moveRobotTo(toX, toY);
                return;
            } catch (RobotConnectionException rce) {
                if (i == 2) {
                    throw rce;
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
