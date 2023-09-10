package AbstractClasses;

public class Boat implements Movable{
    @Override
    public String moveForward() {
        return "La barca si muove in avanti";
    }

    @Override
    public String moveBackward() {
        return "La barca si muove all'indietro";
    }
}
