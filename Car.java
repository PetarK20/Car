public class Car {
    private final String brand;
    private final String model;
    private final int yearOfManufacturing;
    private double price;
    private String color;
    private int mileage;   
    private final Engine engine;
    private final Owner owner;

    public Car(String brand, String model, int yearOfManufacturing, double price,
               String color, int mileage, Engine engine, Owner owner) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
        this.engine = engine;
        this.owner = owner;
    }

    // ======= GETTERS =======
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYearOfManufacturing() { return yearOfManufacturing; }
    public double getPrice() { return price; }
    public String getColor() { return color; }
    public int getMileage() { return mileage; }
    public Engine getEngine() { return engine; }
    public Owner getOwner() { return owner; }

    // Методи
    public boolean isElectric() { return engine.getType().equalsIgnoreCase("Electric"); }
    public boolean isOld() { return yearOfManufacturing < 2015; }
    public boolean needsMaintenance() { return mileage > 150000; }

    public double calculateDepreciation() {
        int age = 2025 - yearOfManufacturing;
        double depreciationRate = isElectric() ? 0.10 : 0.15;
        double currentValue = price * Math.pow((1 - depreciationRate), age);
        return Math.max(currentValue, price * 0.1);
    }

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + yearOfManufacturing + "), " +
                color + ", " + engine + ", " +
                mileage + " км, " + price + " лв., Собственик: " + owner;
    }
}
