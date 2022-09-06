package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        System.out.println(1);
        while (counter <= printToInclusive) {
            int y = 1;
            int result = 1;
            while (y <= counter) {
                result *= y;
                y++;
            }

            System.out.println(result);
            counter++;
        }
    }
}
