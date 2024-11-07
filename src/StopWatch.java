import java.util.Random;

public class StopWatch {
    public static void main(String[] args) {
        int n = 100000;
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100000);
        }

        RunTime runTime = new RunTime();
        runTime.start();

        runTime.stop();

        System.out.println("Time use: " + runTime.getElapsedTime());

    }
}
