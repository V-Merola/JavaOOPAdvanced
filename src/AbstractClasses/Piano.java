package AbstractClasses;

public class Piano extends Instrument{

    public Piano(String name, String brand) {
        super(name, brand);
    }
    @Override
    public String play() {
        return "Piano play";
    }
}
