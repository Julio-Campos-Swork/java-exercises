/*
 * 
 * Nathan loves cycling.

Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.

You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.

For example:

time = 3 ----> litres = 1

time = 6.7---> litres = 3

time = 11.8--> litres = 5
 * 
 */

public class KeepHydrated {
    public int Liters(double time)  {
    double litrePerHour = 0.5;
    double litres = time * litrePerHour;
    int roundedLitres = (int) Math.floor(litres);
        return roundedLitres;
      
      }
    public int Liters2(double time)  {
        return (int) (time * 0.5);
      
      }


      public static void main(String[] args) {
        KeepHydrated kh = new KeepHydrated();
        System.out.println(kh.Liters(2));
        System.out.println(kh.Liters(14.64));
        System.out.println(kh.Liters(0.97));
        System.out.println(kh.Liters(0.97));
      }
}
