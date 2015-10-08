/**
 * Calculations to determine average, minimum, and maximum for an array of integers, returns result as an integer.
 *
 * @author stevelyall
 */

package multithreadstats;

public class Calculator {

    public int calculateAverage(int[] numbers){
        if (numbers.length == 0) {
            return 0;
        }

        int avg = 0;
        for (int number : numbers) {
            avg += number;
        }
        return Math.round(avg / numbers.length);
    }

    public int calculateMinimum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int min = numbers[0];
        for (int number : numbers) {
            if(number < min) {
                min = number;
            }
        }
        return min;
    }

    public int calculateMaximum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int max = numbers[0];
        for (int number : numbers) {
            if(number > max) {
                max = number;
            }
        }
        return max;
    }
}
