/*
 * 
 * https://exercism.org/tracks/java/exercises/captains-log
 */

import java.util.Random;
public class CaptainsLog {
    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }

    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }

    String randomShipRegistryNumber() {
        int i = 1000 + random.nextInt(9000);
        return String.format("NCC-%d", i);
    }

    double randomStardate() {
        double i = 41000 + 1000 * random.nextDouble();
    return i;
    }
}

/*
 * 
 *     char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(10)];
    }
    String randomShipRegistryNumber() {
        return "NCC-" + (1000 + random.nextInt(9000));
    }
    double randomStardate() {
        return 41000.0 + 1000.0 * random.nextDouble();
    }
 * 
 * 
 */