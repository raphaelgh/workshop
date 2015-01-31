/**
 * Created by raphael on 1/31/15.
 */
public class GuessNumber {
    public String getTips(String input, String guess) {
        if (input.equals(guess)) {
            return "4A0B";
        }
        int numCount = input.length();
        int countA = 0;
        for(int i = 0;i<numCount;i++){
            if(input.charAt(i) == guess.charAt(i)){
                countA++;
            }
        }
        return countA + "A" + (numCount - countA) + "B";
    }
}