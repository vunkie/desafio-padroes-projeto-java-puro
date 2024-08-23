package dio.gof.strategy;

public class Robot {
    
    private Behaviour strategy;

    public void setStrategy(Behaviour strategy) {
        this.strategy = strategy;
    }

    public void move() {
        System.out.println("Robo se movendo de acordo com a estrategia: ");
        strategy.move();
    }
    
    public void action() {
        System.out.println("Robo agindo de acordo com a estrategia: ");
        strategy.action();
    }

    public void idle() {
        System.out.println("Robo em modo de espera de acordo com a estrategia: ");
        strategy.idle();
    }

}
