package dk.ralu.springtutorial.aop;

import java.time.Instant;

class Timing {

    private String name;
    private Instant startTime;
    private long nanosStartTime;
    private long nanosFinishTime;

    private Timing() {
    }

    static Timing startNewTiming(String name) {
        Timing timing = new Timing();
        timing.name = name;
        timing.startTime = Instant.now();
        timing.nanosStartTime = System.nanoTime();
        return timing;
    }

    void finished() {
        this.nanosFinishTime = System.nanoTime();
    }

    private double durationInNanos() {
        return (double) (nanosFinishTime - nanosStartTime) / 1_000_000.0;
    }

    @Override
    public String toString() {
        return "Timing{"
                + "name=" + name
                + ", startTime=[" + startTime
                + ", duration=[" + durationInNanos() + " millis]"
                + "}";
    }
}
