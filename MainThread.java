import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xuwei on 2016/11/1.
 */
public class MainThread {
    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();

        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i=0; i<5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
