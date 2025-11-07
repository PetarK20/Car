public class Car {
    private String brand;
    private String model;
    private int yearOfManufacturing;
    private double price;
    private String color;
    private int mileage; // пробег в километри
    private String fuelType; // "Petrol", "Diesel", "Electric", "Hybrid"

    public Car(String brand, String model, int yearOfManufacturing, double price,
               String color, int mileage, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfManufacturing = yearOfManufacturing;
        this.price = price;
        this.color = color;
        this.mileage = mileage;
        this.fuelType = fuelType;
    }

    // ======= GETTERS =======
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getMileage() {
        return mileage;
    }

    public String getFuelType() {
        return fuelType;
    }


    // Проверка дали колата е електрическа
    public boolean isElectric() {
        return fuelType.equalsIgnoreCase("Electric");
    }

    // Проверка дали е "стара" кола (примерно преди 2015)
    public boolean isOld() {
        return yearOfManufacturing < 2015;
    }

    // Проверка дали има нужда от обслужване (примерно над 150 000 км)
    public boolean needsMaintenance() {
        return mileage > 150000;
    }

    // Изчислява текущата стойност на колата (амортизация)
    public double calculateDepreciation() {
        int age = 2025 - yearOfManufacturing;
        double depreciationRate = isElectric() ? 0.10 : 0.15; // по-бавно обезценяване за електрическите
        double currentValue = price * Math.pow((1 - depreciationRate), age);
        return Math.max(currentValue, price * 0.1); // минимална стойност 10% от първоначалната
    }

    // Извежда информация за колата
    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + yearOfManufacturing + "), "
                + color + ", " + fuelType + ", "
                + mileage + " км, " + price + " лв.";
    }
}
