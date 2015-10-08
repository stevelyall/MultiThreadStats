package multithreadstats;

public class MultiThreadStats {

    static int[] inputNumbers;

    public static void main(String[] args) {
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

        // TODO

    }
}
