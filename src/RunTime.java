import java.time.Instant;

public class RunTime {
    private long startTime;
    private long endTime;

    public void StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public double getElapsedTime() {
        return endTime - startTime;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }
}
