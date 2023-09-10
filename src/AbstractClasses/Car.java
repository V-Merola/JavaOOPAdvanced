package AbstractClasses;

public class Car implements Movable{
    @Override
    public String moveForward() {
        return "La macchina si muove in avanti";
    }

    @Override
    public String moveBackward() {
        return "La macchina si muove all'indietro";
    }
}
