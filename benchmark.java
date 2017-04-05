Benchmark.java
public class Benchmark {

    private static double global;

    public static void main(String[] args) {
        long t1 = System.nanoTime();
        double x = 1d;
        double y = 1d;
        // code
        for (long i = 0; 1000 * 1000 * 1000 > i; i++) {
            x = execute(i);
        }
        long t2 = System.nanoTime();
        System.out.println("Elapsed time:" + (((t2 - t1) * 1e-6)) + " miliseconds.");
    }

    protected static double execute(double arg) {
        global = arg * 6;
        global *= 4.3210;
        global /= 2.1234;
        return global;
    }
}
