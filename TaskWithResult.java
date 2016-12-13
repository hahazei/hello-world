import java.util.concurrent.Callable;

/**
 * Created by xuwei on 2016/11/1.
 */
public class TaskWithResult implements Callable<String> {
    private int id;
    public TaskWithResult(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        return "result " + id;
    }
}
