package ss5_class_and_obiect.bai_tap.Lop_StopWatch;

public class TestStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime();
        System.out.println(stopWatch.getStarTime());
        test();
        stopWatch.stopTime();
        System.out.println(stopWatch.getStopTime());
        System.out.println(stopWatch.getElapsedTime());
    }
    public static int test(){
        int tests = 0;
        for (int i = 0; i < 1000000000; i++) {
                tests += i;
        }
        return tests;
    }
}
