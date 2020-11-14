import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static final int N = 100000;
    public static final int M = 100000;
    private static SharedObject sharedObject;

    private static List<ThreadInc> threadIncList;
    private static List<ThreadDec> threadDecList;

    public static void main(String[] args) {
        //текущее время 1
        long m1 = System.currentTimeMillis();

        sharedObject = new SharedObject();
        threadIncList = new ArrayList<>();
        threadDecList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            ThreadInc threadInc = new ThreadInc(sharedObject);
            threadIncList.add(threadInc);
            threadInc.start();
            try {
                threadInc.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int j = 0; j < M; j++) {
            ThreadDec threadDec = new ThreadDec(sharedObject);
            threadDecList.add(threadDec);
            threadDec.start();
            try {
                threadDec.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // текущее время 2 
        long m2 = System.currentTimeMillis();
        System.out.println(sharedObject.getCounter());
        System.out.println("Result: " + m2 + "-" + m1 + "=" + (m2-m1));
        
    }
}