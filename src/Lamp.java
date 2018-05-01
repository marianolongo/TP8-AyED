public class Lamp implements Comparable<Lamp>{
    String lampCode;
    int watts;
    String lampType;
    int quantity;

    public Lamp(String lampCode, int watts, String lampType, int quantity) {
        this.lampCode = lampCode;
        this.watts = watts;
        this.lampType = lampType;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Lamp lamp) {
        return this.lampCode.compareTo(lamp.lampCode);
    }
}
