import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();

        // 50 уникални коли
        cars.add(new Car("Tesla", "Model S", 2022, 150000, "White", 20000,
                new Engine("Electric", 396), new Owner("Ivan Petrov", "0888123456")));
        cars.add(new Car("Tesla", "Model 3", 2021, 120000, "Black", 35000,
                new Engine("Electric", 283), new Owner("Maria Ivanova", "0888234567")));
        cars.add(new Car("Tesla", "Model X", 2020, 180000, "Blue", 40000,
                new Engine("Electric", 503), new Owner("Georgi Dimitrov", "0888345678")));
        cars.add(new Car("Tesla", "Model Y", 2022, 130000, "Red", 15000,
                new Engine("Electric", 384), new Owner("Petya Koleva", "0888456789")));

        cars.add(new Car("Toyota", "Corolla", 2012, 18000, "Silver", 195000,
                new Engine("Petrol", 132), new Owner("Stefan Ivanov", "0888567890")));
        cars.add(new Car("Toyota", "Camry", 2018, 35000, "Red", 120000,
                new Engine("Petrol", 178), new Owner("Elena Petrova", "0888678901")));
        cars.add(new Car("Toyota", "RAV4", 2019, 40000, "White", 90000,
                new Engine("Hybrid", 222), new Owner("Viktor Dimitrov", "0888789012")));

        cars.add(new Car("BMW", "X5", 2018, 85000, "Black", 110000,
                new Engine("Diesel", 265), new Owner("Daniel Kolev", "0888890123")));
        cars.add(new Car("BMW", "X3", 2020, 65000, "Blue", 50000,
                new Engine("Diesel", 248), new Owner("Anna Georgieva", "0888901234")));
        cars.add(new Car("BMW", "M3", 2021, 90000, "White", 30000,
                new Engine("Petrol", 473), new Owner("Ivan Ivanov", "0888012345")));

        cars.add(new Car("Audi", "A6", 2015, 70000, "Gray", 140000,
                new Engine("Diesel", 245), new Owner("Petya Stoyanova", "0888123457")));
        cars.add(new Car("Audi", "A4", 2019, 55000, "Black", 60000,
                new Engine("Petrol", 190), new Owner("Georgi Marinov", "0888234568")));
        cars.add(new Car("Audi", "Q5", 2020, 75000, "Blue", 40000,
                new Engine("Hybrid", 245), new Owner("Elena Koleva", "0888345679")));

        cars.add(new Car("Nissan", "Leaf", 2019, 65000, "Blue", 80000,
                new Engine("Electric", 147), new Owner("Stefan Petrov", "0888456790")));
        cars.add(new Car("Nissan", "Altima", 2017, 30000, "White", 130000,
                new Engine("Petrol", 188), new Owner("Maria Dimitrova", "0888567901")));
        cars.add(new Car("Nissan", "X-Trail", 2018, 40000, "Gray", 90000,
                new Engine("Diesel", 177), new Owner("Ivan Stefanov", "0888679012")));

        cars.add(new Car("Ford", "Focus", 2015, 20000, "Red", 110000,
                new Engine("Petrol", 160), new Owner("Petar Ivanov", "0888789123")));
        cars.add(new Car("Ford", "Fiesta", 2018, 15000, "Blue", 70000,
                new Engine("Petrol", 120), new Owner("Anna Dimitrova", "0888891234")));
        cars.add(new Car("Ford", "Mustang", 2020, 60000, "Black", 30000,
                new Engine("Petrol", 450), new Owner("Stefan Kolev", "0888902345")));

        cars.add(new Car("Mercedes", "C-Class", 2019, 65000, "White", 50000,
                new Engine("Diesel", 194), new Owner("Elena Ivanova", "0888013456")));
        cars.add(new Car("Mercedes", "E-Class", 2018, 80000, "Black", 70000,
                new Engine("Diesel", 258), new Owner("Georgi Petrov", "0888124567")));
        cars.add(new Car("Mercedes", "GLE", 2020, 95000, "Gray", 40000,
                new Engine("Hybrid", 362), new Owner("Petya Dimitrova", "0888235678")));

        cars.add(new Car("Volkswagen", "Golf", 2017, 25000, "Blue", 90000,
                new Engine("Petrol", 147), new Owner("Ivan Kolev", "0888346789")));
        cars.add(new Car("Volkswagen", "Passat", 2019, 40000, "Silver", 60000,
                new Engine("Diesel", 174), new Owner("Maria Stoyanova", "0888457890")));
        cars.add(new Car("Volkswagen", "Tiguan", 2020, 50000, "Red", 40000,
                new Engine("Diesel", 197), new Owner("Stefan Marinov", "0888568901")));

        cars.add(new Car("Kia", "Sportage", 2018, 30000, "White", 70000,
                new Engine("Petrol", 177), new Owner("Elena Georgieva", "0888679013")));
        cars.add(new Car("Kia", "Ceed", 2019, 22000, "Gray", 60000,
                new Engine("Petrol", 140), new Owner("Petar Dimitrov", "0888789124")));
        cars.add(new Car("Kia", "Sorento", 2021, 45000, "Black", 30000,
                new Engine("Diesel", 200), new Owner("Anna Petkova", "0888891235")));

        cars.add(new Car("Hyundai", "Tucson", 2018, 28000, "Blue", 80000,
                new Engine("Petrol", 177), new Owner("Stefan Georgiev", "0888902346")));
        cars.add(new Car("Hyundai", "Elantra", 2019, 20000, "White", 50000,
                new Engine("Petrol", 147), new Owner("Maria Koleva", "0888013457")));
        cars.add(new Car("Hyundai", "Santa Fe", 2020, 40000, "Gray", 40000,
                new Engine("Diesel", 202), new Owner("Ivan Marinov", "0888124568")));

        cars.add(new Car("Mazda", "CX-5", 2018, 35000, "Red", 60000,
                new Engine("Petrol", 192), new Owner("Elena Petkova", "0888235679")));
        cars.add(new Car("Mazda", "3", 2019, 22000, "Black", 40000,
                new Engine("Petrol", 155), new Owner("Petar Ivanov", "0888346780")));
        cars.add(new Car("Mazda", "6", 2020, 30000, "White", 30000,
                new Engine("Diesel", 184), new Owner("Anna Dimitrova", "0888457891")));

        cars.add(new Car("Opel", "Astra", 2017, 18000, "Blue", 80000,
                new Engine("Petrol", 140), new Owner("Stefan Petrov", "0888568902")));
        cars.add(new Car("Opel", "Insignia", 2019, 30000, "Gray", 50000,
                new Engine("Diesel", 195), new Owner("Maria Koleva", "0888679014")));
        cars.add(new Car("Opel", "Grandland", 2020, 40000, "Red", 30000,
                new Engine("Hybrid", 225), new Owner("Ivan Stoyanov", "0888789125")));


        // === Извеждане на всички коли ===
        System.out.println("=== Всички коли ===");
        for (Car car : cars) {
            car.printInfo();
        }

        // === Примерни методи на CarManager ===
        System.out.println("\n=== Филтриране по марка (Tesla) ===");
        ArrayList<Car> teslas = CarManager.filterByBrand(cars, "Tesla");
        for (Car car : teslas) {
            car.printInfo();
        }

        System.out.println("\n=== Филтриране по година (2020) ===");
        ArrayList<Car> cars2020 = CarManager.filterByYear(cars, 2020);
        for (Car car : cars2020) {
            car.printInfo();
        }

        System.out.println("\n=== Електрически коли ===");
        ArrayList<Car> electricCars = CarManager.filterElectricCars(cars);
        for (Car car : electricCars) {
            car.printInfo();
        }

        System.out.println("\n=== Коли, нуждаещи се от сервиз ===");
        ArrayList<Car> maintenanceCars = CarManager.filterCarsNeedingMaintenance(cars);
        for (Car car : maintenanceCars) {
            car.printInfo();
        }

        System.out.println("\n=== Най-евтина кола ===");
        Car cheapest = CarManager.findCheapestCar(cars);
        if (cheapest != null) cheapest.printInfo();

        System.out.println("\n=== Най-скъпа кола ===");
        Car expensive = CarManager.findMostExpensiveCar(cars);
        if (expensive != null) expensive.printInfo();

        System.out.println("\n=== Средна цена на колите ===");
        System.out.println(CarManager.averagePrice(cars));

        System.out.println("\n=== Коли сортирани по цена ===");
        ArrayList<Car> sortedCars = new ArrayList<>(CarManager.sortCarsByPrice(cars));
        for (Car car : sortedCars) {
            car.printInfo();
        }
    }
}
