package ObjectClassOverridingEqualsToString;

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    @Override
    public String toString(){
        String infoPerson = "Ciao, sono " + this.name + " ,ho " + this.age + " anni e vivo in: " + this.address;
        return infoPerson;
    }

    @Override
    public int hashCode() {
        return (this.name + this.age + this.address).hashCode();
    }
}
