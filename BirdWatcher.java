/*
 * 
 * You're an avid bird watcher who keeps track of how many birds have visited your garden in the last seven days.

You have six tasks, all dealing with the numbers of birds that visited your garden.

for full information 
https://exercism.org/tracks/java/exercises/bird-watcher
 */

public class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                return true;
            } 
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        int sum =0;
       for(int i = 0; i < numberOfDays; i++){
           sum += birdsPerDay[i];
       }
       return sum;
    
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int birds : birdsPerDay) {
            if(birds >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }
}

/*
 * 
 *ANOTHER SOLUTIONS

  private int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }
    public int[] getLastWeek() {
        return birdsPerDay;
    }
    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length -1];
    }
    public int incrementTodaysCount() {
        int idx = birdsPerDay.length - 1;
        birdsPerDay[idx] = ++birdsPerDay[idx];
        return birdsPerDay[idx];
    }
    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).filter(a -> a == 0).findAny().isPresent();
    }
    public int getCountForFirstDays(int numberOfDays) {
       return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
    }
    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(a -> a >= 5).count();
    }
 */
