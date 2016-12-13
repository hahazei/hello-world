import java.util.Timer;

/**
 * Created by xuwei on 2016/11/24.
 */
public class TestTask {
    public static void main(String[] args) {
        Timer timer = new Timer();
        MyTask myTask = new MyTask();
        timer.schedule(myTask, 1000, 5000);
    }
}
