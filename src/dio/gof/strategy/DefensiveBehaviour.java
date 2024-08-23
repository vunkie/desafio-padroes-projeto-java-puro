package dio.gof.strategy;

public class DefensiveBehaviour implements Behaviour {

    @Override
    public void move() {
        System.out.println("Mover defensivo");
    }

    @Override
    public void action() {
        System.out.println("Defendendo com escudo");
    }

    @Override
    public void idle() {
        System.out.println("Esperando alvo em posição de defesa");
    }
    
}
