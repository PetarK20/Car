import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // Създаваме списък с коли
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Tesla", "Model 3", 2022, 120000, "White", 35000, "Electric"));
        cars.add(new Car("Toyota", "Corolla", 2012, 18000, "Silver", 195000, "Petrol"));
        cars.add(new Car("BMW", "X5", 2018, 85000, "Black", 110000, "Diesel"));
        cars.add(new Car("Nissan", "Leaf", 2019, 65000, "Blue", 80000, "Electric"));
        cars.add(new Car("Audi", "A6", 2015, 70000, "Gray", 140000, "Diesel"));

        // Принтираме информация за всички коли
        System.out.println("=== Списък с коли ===");
        for (Car car : cars) {
            car.printInfo();
        }

        System.out.println("\n=== Проверка дали колата е стара ===");
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " -> стара ли е? " + car.isOld());
        }

        System.out.println("\n=== Проверка дали колата е електрическа ===");
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " -> електрическа? " + car.isElectric());
        }

        System.out.println("\n=== Проверка дали има нужда от обслужване ===");
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " -> нужда от сервиз? " + car.needsMaintenance());
        }

        System.out.println("\n=== Изчисляване на текущата стойност ===");
        for (Car car : cars) {
            double currentValue = car.calculateDepreciation();
            System.out.printf("%s %s -> сегашна стойност: %.2f лв.%n", car.getBrand(), car.getModel(), currentValue);
        }

        // Демонстрация на конкретни извиквания
        Car tesla = cars.get(0);
        System.out.println("\n=== Демонстрация с конкретна кола ===");
        tesla.printInfo();
        System.out.println("Електрическа ли е? " + tesla.isElectric());
        System.out.println("Стара ли е? " + tesla.isOld());
        System.out.println("Нуждае ли се от обслужване? " + tesla.needsMaintenance());
        System.out.println("Текуща стойност: " + tesla.calculateDepreciation() + " лв.");
    }
}
