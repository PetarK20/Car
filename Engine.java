public class Engine {
    private final String type;       // Petrol, Diesel, Electric, Hybrid
    private final int horsePower;

    public Engine(String type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return type + " (" + horsePower + " HP)";
    }
}
