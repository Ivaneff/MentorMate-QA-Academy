package methodsAndConstructors;

import java.util.Arrays;
import java.util.List;

public class Car_main {
    public static void main(String[] args) {
        Car car1 = new Car("Dodge", "yellow", 1962, 240, true);
        Car car2 = new Car("Ford", "green", true);
        Car car3 = new Car("Pontiac", "blue", 1973, 186);
        Car car4 = new Car("BMW", 1982, 280, true);
        Car car5 = new Car();

        List<Car> cars = Arrays.asList(car1, car2, car3, car4, car5);

        for (Car car : cars) {
            System.out.println(car.getName() + " " + car.getColour() + " " + car.getYearRelease() + " " + car.getHorsePower() + " " + car.isSecondHand());
        }

    }
}
