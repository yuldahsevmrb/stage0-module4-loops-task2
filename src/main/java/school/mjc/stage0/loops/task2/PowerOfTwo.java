package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int counter = 0;
        if (power >= 0) {
            while (counter <= power) {
                if (counter == 0) {
                    System.out.println(1);
                    counter++;
                } else {
                    System.out.println((int) Math.pow(2, counter));
                    counter++;
                }
            }
        } else {
            System.out.println("too much power");
        }
    }
}
