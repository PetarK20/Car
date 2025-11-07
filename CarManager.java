import java.util.ArrayList;

public class CarManager {

    public static ArrayList<Car> filterByBrand(ArrayList<Car> cars, String brand) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brand)) {
                result.add(car);
            }
        }
        return result;
    }

    public static ArrayList<Car> filterByYear(ArrayList<Car> cars, int year) {
        ArrayList<Car> result = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYearOfManufacturing() == year) {
                result.add(car);
            }
        }
        return result;
    }
}
