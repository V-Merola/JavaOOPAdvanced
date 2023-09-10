package AbstractClasses;

public class Guitar extends Instrument{

    public Guitar(String name, String brand) {
        super(name, brand);
    }
    @Override
    public String play() {
        return "Guitar play";
    }
}
