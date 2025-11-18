import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Tesla", "Model 3", 2022, 120000, "White", 35000, "Electric"));
        cars.add(new Car("Toyota", "Corolla", 2012, 18000, "Silver", 195000, "Petrol"));
        cars.add(new Car("BMW", "X5", 2018, 85000, "Black", 110000, "Diesel"));
        cars.add(new Car("Nissan", "Leaf", 2019, 65000, "Blue", 80000, "Electric"));
        cars.add(new Car("Audi", "A6", 2015, 70000, "Gray", 140000, "Diesel"));
        cars.add(new Car("Toyota", "Camry", 2018, 35000, "Red", 120000, "Petrol"));

        System.out.println("=== Всички коли ===");
        for (Car car : cars) {
            car.printInfo();
        }

        System.out.println("\n=== Проверка на методите от Car ===");
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel() +
                    " | Стара: " + car.isOld() +
                    " | Електрическа: " + car.isElectric() +
                    " | Нужда от сервиз: " + car.needsMaintenance() +
                    " | Текуща стойност: " + car.calculateDepreciation());
        }

        System.out.println("\n=== Филтриране по марка (Toyota) ===");
        ArrayList<Car> toyotas = CarManager.filterByBrand(cars, "Toyota");
        for (Car car : toyotas) {
            car.printInfo();
        }

        System.out.println("\n=== Филтриране по година (2018) ===");
        ArrayList<Car> cars2018 = CarManager.filterByYear(cars, 2018);
        for (Car car : cars2018) {
            car.printInfo();
        }

        ArrayList<Car> sortedCars = new ArrayList<>(CarManager.sortCarsByPrice(cars));

        System.out.println("\n=== Коли сортирани по цена ===");
        for (Car car : sortedCars) {
            car.printInfo();
        }


        System.out.println("\n=== Проверка с конкретна кола (Tesla) ===");
        Car tesla = cars.get(0);
        tesla.printInfo();
        System.out.println("Електрическа: " + tesla.isElectric());
        System.out.println("Стара: " + tesla.isOld());
        System.out.println("Нужда от сервиз: " + tesla.needsMaintenance());
        System.out.println("Текуща стойност: " + tesla.calculateDepreciation());
    }
}
