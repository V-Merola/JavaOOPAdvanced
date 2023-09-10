package Records;

public record Person(String name, int age, String address) {
    public String toString(){
        String stringa = "Sono: " + name + "\n" + " ho " + age + " anni " + "\n" + "Vivo in : " + address;
        return stringa;
    }
}
