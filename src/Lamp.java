public class Lamp implements Comparable<Lamp>{
    private String lampCode;
    private int watts;
    private String lampType;
    private int quantity;

    public Lamp(String lampCode, int watts, String lampType, int quantity) {
        this.lampCode = lampCode;
        this.watts = watts;
        this.lampType = lampType;
        this.quantity = quantity;
    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public void setLampType(String lampType) {
        this.lampType = lampType;
    }

    @Override
    public int compareTo(Lamp lamp) {
        return this.lampCode.compareTo(lamp.lampCode);
    }

    @Override
    public String toString() {
        return lampType;
    }
}
