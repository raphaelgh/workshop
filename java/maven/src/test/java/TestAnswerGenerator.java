/**
 * Created by raphael on 2/3/15.
 */
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
public class TestAnswerGenerator {
    @Test
    public void test_generator_one_number(){
        String number = AnswerGenerator.generate();
        assertThat(number.length()).isGreaterThanOrEqualTo(1);
        int i = Integer.parseInt(number.substring(0, 1));
        assertThat(i).isGreaterThanOrEqualTo(0);
        assertThat(i).isLessThanOrEqualTo(9);
    }

    @Test
    public void test_generator_two_different_number(){
        for(int i = 0; i < 100; i++){
            String number = AnswerGenerator.generate();
            char[] numbers = number.toCharArray();
            assertThat(numbers.length).isGreaterThanOrEqualTo(2);
            assertThat(numbers[0]).isNotEqualTo(numbers[1]);
        }
    }

    @Test
    public void test_generator_random_number(){
        String number1 = AnswerGenerator.generate();
        int testCount = 100;
        int equalCount = 0;
        for(int i = 0; i < testCount; i++){
            String number2 = AnswerGenerator.generate();
            equalCount = number1.equals(number2) ? ++equalCount : equalCount;
        }
        assertThat(equalCount).isLessThan(testCount);
    }

    @Test
    public void test_generator_three_different_number(){
        for(int i = 0; i < 100; i++){
            String number = AnswerGenerator.generate();
            char[] numbers = number.toCharArray();
            assertThat(numbers.length).isGreaterThanOrEqualTo(3);
            assertThat(numbers[0]).isNotEqualTo(numbers[1]);
            assertThat(numbers[0]).isNotEqualTo(numbers[2]);
            assertThat(numbers[1]).isNotEqualTo(numbers[2]);
        }
    }

    @Test
    public void test_generator_four_different_number(){
        for(int i = 0; i < 100; i++){
            String number = AnswerGenerator.generate();
            char[] numbers = number.toCharArray();
            assertThat(numbers.length).isEqualTo(4);
            assertThat(numbers[0]).isNotEqualTo(numbers[1]);
            assertThat(numbers[0]).isNotEqualTo(numbers[2]);
            assertThat(numbers[0]).isNotEqualTo(numbers[3]);
            assertThat(numbers[1]).isNotEqualTo(numbers[2]);
            assertThat(numbers[1]).isNotEqualTo(numbers[3]);
            assertThat(numbers[2]).isNotEqualTo(numbers[3]);
        }
    }
}
