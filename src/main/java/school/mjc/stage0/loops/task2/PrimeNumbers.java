package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        // 13
        while (counter <= printToInclusive){
            int temp = 2;
            boolean found = false;
            while (temp < counter){
                if(counter % temp == 0){
                    found = true;
                    break;
                }
                temp++;
            }
            if(!found){
                System.out.println(counter);
            }
            counter++;
        }
    }
}
