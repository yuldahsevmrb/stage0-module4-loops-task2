package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int counter = 0;
        String x = "";
        while (counter < chars.length){
            x = x + String.valueOf(chars[counter]);
            counter++;
        }
        System.out.print(x);
    }
}
