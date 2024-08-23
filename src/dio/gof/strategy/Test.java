package dio.gof.strategy;

public class Test {
    public static void main(String[] args) {
        Behaviour normal = new NormalBehaviour();
        Behaviour agressive = new AgressiveBehaviour();
        Behaviour defensive = new DefensiveBehaviour();
        
        // normal.move();
        // agressive.move();
        // defensive.move();


        Robot robot = new Robot();
        robot.setStrategy(normal);
        robot.move();

        robot.setStrategy(agressive);
        robot.move();

        robot.setStrategy(defensive);
        robot.move();

        robot.setStrategy(normal);
        robot.action();
        robot.idle();

        robot.setStrategy(agressive);
        robot.action();
        robot.idle();

        robot.setStrategy(defensive);
        robot.action();
        robot.idle();


    }
}
