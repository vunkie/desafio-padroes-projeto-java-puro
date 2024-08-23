package dio.gof.strategy;

public class AgressiveBehaviour implements Behaviour {

    @Override
    public void move() {
        System.out.println("Mover agressivo");
    }

    @Override
    public void action() {
        System.out.println("Atacando alvo");
    }

    @Override
    public void idle() {
        System.out.println("Esperando alvo em posição de ataque");
    }
    
}
