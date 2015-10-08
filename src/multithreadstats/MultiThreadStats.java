package multithreadstats;

public class MultiThreadStats {

    static Calculator calc;
    static int[] inputNumbers;

    public static void main(String[] args) {
        // check and parse arguments
        if (args.length < 1) {
            System.out.println("Must provide at least one integer argument.\nUsage: MultiThreadStats <number> <number> ...");
        }

        inputNumbers = new int[args.length];
        try {
            for (int i = 0; i < args.length; i++) {
                inputNumbers[i] = Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }

        calc = new Calculator();

        // wrapper classes to get result from Runnable
        final Result avg = new Result();
        Thread avgThread = new Thread(new Runnable() {
            @Override
            public void run() {
                avg.setResult(calc.calculateAverage(inputNumbers));
            }
        });

        final Result min = new Result();
        Thread minThread = new Thread(new Runnable() {
            @Override
            public void run() {
                min.setResult(calc.calculateMinimum(inputNumbers));
            }
        });

        final Result max = new Result();
        Thread maxThread = new Thread(new Runnable() {
            @Override
            public void run() {
                max.setResult(calc.calculateMaximum(inputNumbers));
            }
        });

        // start threads
        avgThread.start();
        minThread.start();
        maxThread.start();

        try {
            // wait for all threads to finish executing
            avgThread.join();
            minThread.join();
            maxThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Average: " + avg.getResult());
        System.out.println("Minimum: " + min.getResult());
        System.out.println("Maximum: " + max.getResult());
    }
}
