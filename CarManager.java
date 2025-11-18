import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CarManager {

    // Филтрира коли по марка
    public static ArrayList<Car> filterByBrand(ArrayList<Car> cars, String brand) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                result.add(car);
            }
        }
        return result;
    }

    // Филтрира коли по година на производство
    public static ArrayList<Car> filterByYear(ArrayList<Car> cars, int year) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacturing() == year) {
                result.add(car);
            }
        }
        return result;
    }

    // Сортира коли по цена (възходящо)
    public static List<Car> sortCarsByPrice(List<Car> cars) {
        List<Car> sortedCars = new ArrayList<>(cars);
        sortedCars.sort((c1, c2) -> Double.compare(c1.getPrice(), c2.getPrice()));
        return sortedCars;
    }

    // Филтрира електрически коли
    public static ArrayList<Car> filterElectricCars(ArrayList<Car> cars) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.isElectric()) {
                result.add(car);
            }
        }
        return result;
    }

    // Филтрира коли, които имат нужда от сервиз
    public static ArrayList<Car> filterCarsNeedingMaintenance(ArrayList<Car> cars) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.needsMaintenance()) {
                result.add(car);
            }
        }
        return result;
    }

    // Намира най-евтината кола
    public static Car findCheapestCar(ArrayList<Car> cars) {
        if (cars.isEmpty()) return null;
        Car cheapest = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() < cheapest.getPrice()) {
                cheapest = car;
            }
        }
        return cheapest;
    }

    // Намира най-скъпата кола
    public static Car findMostExpensiveCar(ArrayList<Car> cars) {
        if (cars.isEmpty()) return null;
        Car expensive = cars.get(0);
        for (Car car : cars) {
            if (car.getPrice() > expensive.getPrice()) {
                expensive = car;
            }
        }
        return expensive;
    }

    // Филтрира коли по собственик
    public static ArrayList<Car> filterByOwner(ArrayList<Car> cars, String ownerName) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getOwner().getName().equalsIgnoreCase(ownerName)) {
                result.add(car);
            }
        }
        return result;
    }

    // Връща средна цена на колите
    public static double averagePrice(ArrayList<Car> cars) {
        if (cars.isEmpty()) return 0.0;
        double sum = 0;
        for (Car car : cars) {
            sum += car.getPrice();
        }
        return sum / cars.size();
    }
    public static void addCar(ArrayList<Car> cars) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Въведете марка: ");
            String brand = reader.readLine();

            System.out.print("Въведете модел: ");
            String model = reader.readLine();

            System.out.print("Въведете година на производство: ");
            int year = Integer.parseInt(reader.readLine());

            System.out.print("Въведете цена: ");
            double price = Double.parseDouble(reader.readLine());

            System.out.print("Въведете цвят: ");
            String color = reader.readLine();

            System.out.print("Въведете пробег (км): ");
            int mileage = Integer.parseInt(reader.readLine());

            System.out.print("Въведете тип двигател (Petrol/Diesel/Electric/Hybrid): ");
            String engineType = reader.readLine();

            System.out.print("Въведете мощност на двигателя (HP): ");
            int hp = Integer.parseInt(reader.readLine());

            System.out.print("Въведете име на собственика: ");
            String ownerName = reader.readLine();

            System.out.print("Въведете телефон на собственика: ");
            String ownerPhone = reader.readLine();

            // Създаваме Engine и Owner обекти
            Engine engine = new Engine(engineType, hp);
            Owner owner = new Owner(ownerName, ownerPhone);

            // Създаваме Car обекта и го добавяме в списъка
            Car newCar = new Car(brand, model, year, price, color, mileage, engine, owner);
            cars.add(newCar);

            System.out.println("Кола добавена успешно!");

        } catch (IOException e) {
            System.out.println("Грешка при четене от конзолата: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Грешка: Въведената стойност трябва да е число. Опитайте пак.");
        }
    }
}
