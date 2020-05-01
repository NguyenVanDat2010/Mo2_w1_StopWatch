import java.time.LocalTime;

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    StopWatch() {
        startTime = LocalTime.now();
    }

    StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    LocalTime getStartTime() {
        return startTime;
    }

    LocalTime getEndTime() {
        return endTime;
    }

    void start() {
        LocalTime startTime = LocalTime.now();
    }

    void stop() {
        LocalTime stopTime = LocalTime.now();
    }

    int getElapsedTime() {
        int milliSecond = ((endTime.getHour() - startTime.getHour()) * 3600 +
                (endTime.getMinute() - startTime.getMinute()) * 60 +
                (endTime.getSecond() - startTime.getSecond())) * 1000;
        return milliSecond;
    }
}
