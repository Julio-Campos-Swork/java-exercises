/*
 * 
 * 
 * 
 * FULL EXERSICE https://exercism.org/tracks/java/exercises/elons-toy-car
 */

public class ElonsToyCar {
    private int distance = 0;
    private int battery = 100;

    public static ElonsToyCar buy() {
        return new ElonsToyCar();

    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", this.distance);
    }

    public String batteryDisplay() {
        return (this.battery > 0) ? String.format("Battery at %d%%", this.battery) : "Battery empty";
    }

    public void drive() {
        if (this.battery > 0) {
            this.distance += 20;
            this.battery -= 1;
        } else{
            this.battery = 0;
        }

    }

    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
        car.drive();
        car.drive();
        System.out.println(car.distanceDisplay());
        System.out.println(car.batteryDisplay());
    }
}
