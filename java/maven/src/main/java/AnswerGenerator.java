import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by raphael on 2/3/15.
 */
public class AnswerGenerator {
    public static String generate_before_refactor() {
        Random randomGenerator = new Random();
        int numberOne = randomGenerator.nextInt(10);
        int numberTwo = randomGenerator.nextInt(10);
        while(numberOne == numberTwo){
            numberTwo = randomGenerator.nextInt(10);
        }
        int numberThree = randomGenerator.nextInt(10);
        while(numberThree == numberTwo || numberThree == numberOne){
            numberThree = randomGenerator.nextInt(10);
        }
        int numberFour = randomGenerator.nextInt(10);
        while(numberFour == numberTwo || numberFour == numberOne || numberFour == numberThree){
            numberFour = randomGenerator.nextInt(10);
        }
        return "" + numberOne + numberTwo + numberThree + numberFour;
    }

    public static String generate() {
        List<String> numberList = new ArrayList<String>();
        initList(numberList);
        Random randomGenerator = new Random();
        String numberFour = "";
        for(int i = 0; i < 4; i++){
            int index = randomGenerator.nextInt(10-i);
            numberFour += numberList.remove(index);
        }
        return numberFour;
    }

    private static void initList(List<String> list){
        int i = 0;
        while(i < 10){
            list.add(String.valueOf(i));
            i++;
        }
    }
}
