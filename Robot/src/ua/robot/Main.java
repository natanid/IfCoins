package ua.robot;

public class Main {

	public static void main(String[] args) {

		Robot robot = new Robot();
		robot.work();

		CoffeRobot coffeRobot = new CoffeRobot();
		coffeRobot.work();

		RobotDancer robotDancer = new RobotDancer();
		robotDancer.work();

		RobotCoocker robotCoocker = new RobotCoocker();
		robotCoocker.work();

		Robot[] robots = new Robot[] { robot, coffeRobot, robotDancer, robotCoocker };

		for (int i = 0; i < robots.length; i++) {
			robots[i].work();

		}
	}

}
