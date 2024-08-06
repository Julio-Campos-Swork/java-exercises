/*
 * 
 * https://exercism.org/tracks/java/exercises/need-for-speed/
 * 
 */

public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven;
    private int battery;

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.distanceDriven = 0;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return batteryDrain > battery;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (battery >= batteryDrain) {
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);

    }

    public int getBatery() {
        return battery;
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while (!car.batteryDrained() && car.distanceDriven() < distance) {
            car.drive();
        }

        return car.distanceDriven() >= distance;
    }

    public static void main(String[] args) {
        // int speed = 5;
        // int batteryDrain = 2;
        // var car = new NeedForSpeed(speed, batteryDrain);

        // int distance = 800;
        // var raceTrack = new RaceTrack(distance);

        // car.drive();
        // System.out.println(car.distanceDriven()); // => 5
        // System.out.println(car.batteryDrained()); // => false

        // var car2 = new NeedForSpeed(1, 99);
        // car2.drive();
        // System.out.println(car2.getBatery());
        // System.out.println(car2.batteryDrained());
        int speed = 10;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);

        int distance = 100;
        var race = new RaceTrack(distance);

        System.out.println(car.distanceDriven());
        // => 0

        System.out.println(race.canFinishRace(car));
        // => true

        System.out.println(car.distanceDriven());
        // => 100
    }
}
