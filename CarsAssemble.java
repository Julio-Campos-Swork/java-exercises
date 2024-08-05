/*
 * In this exercise you'll be writing code to analyze the production of an assembly line in a car factory. 
 * The assembly line's speed can range from 0 (off) to 10 (maximum).

At its lowest speed (1), 221 cars are produced each hour. The production increases linearly with the speed. So with the speed set to 4, 
it should produce 4 * 221 = 884 cars per hour. However, higher speeds increase the likelihood that faulty cars are produced, 
which then have to be discarded. The following table shows how speed influences the success rate:

1 to 4: 100% success rate.
5 to 8: 90% success rate.
9: 80% success rate.
10: 77% success rate.
You have two tasks.
 * 
 */

public class CarsAssemble {
    public static double productionRatePerHour(int speed) {
        if (speed >= 1 && speed <= 4) {
            return speed * 221;
        } else if (speed >= 5 && speed <= 8) {
            return speed * 221 * 0.9;
        } else if (speed == 9) {
            return speed * 221 * 0.8;
        } else if (speed == 10) {
            return speed * 221 * 0.77;
        } else {
            return 0;
        }
    }

    public static int workingItemsPerMinute(int speed) {
        
            return (int) productionRatePerHour(speed) / 60;
       

    }

    public static void main(String[] args) {
        System.out.println(workingItemsPerMinute(5));
    }
}
