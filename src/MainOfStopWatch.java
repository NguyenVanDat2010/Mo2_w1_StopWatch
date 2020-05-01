import java.time.LocalTime;

public class MainOfStopWatch {

    public int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int tempt = a[i];
                    a[i] = a[j];
                    a[j] = tempt;
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        MainOfStopWatch mainOfStopWatch = new MainOfStopWatch();
        int[] a = new int[100000];
        LocalTime start = LocalTime.now();
        mainOfStopWatch.selectionSort(a);
        LocalTime end = LocalTime.now();
        StopWatch stopWatch = new StopWatch(start, end);
        System.out.println("Time: " + stopWatch.getElapsedTime());
        for (int n : a) {
            System.out.println(n);
        }
    }
}
