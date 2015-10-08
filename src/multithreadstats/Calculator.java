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
        return avg/numbers.length;
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
