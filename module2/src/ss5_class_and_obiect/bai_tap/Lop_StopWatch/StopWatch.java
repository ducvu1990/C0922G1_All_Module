package ss5_class_and_obiect.bai_tap.Lop_StopWatch;

public class StopWatch {
    public long starTime;
    public long stopTime;

    public long getStarTime() {
        return starTime;
    }

    public long getStopTime() {
        return stopTime;
    }

    public void startTime(){
        this.starTime = System.currentTimeMillis();
    }

    public void stopTime(){
        this.stopTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return (this.getStopTime() - this.getStarTime());
    }
}
