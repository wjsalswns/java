package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        Car modelCar = new Model3Car();
        driver.setCar(modelCar);
        driver.drive();
    }
}
