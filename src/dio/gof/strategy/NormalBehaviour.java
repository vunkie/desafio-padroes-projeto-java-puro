package dio.gof.strategy;

public class NormalBehaviour implements Behaviour {

    @Override
    public void move() {
        System.out.println("Mover normal");
    }

    @Override
    public void action() {
        System.out.println("Localizando possiveis alvos");
    }
    
    @Override
    public void idle() {
        System.out.println("Modo de descanso");
    }

}
