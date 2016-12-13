import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/**
 * Created by xuwei on 2016/11/24.
 */
public class MyTask extends TimerTask {
    /**
     * The action to be performed by this timer task.
     */
    @Override
    public void run() {
        SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        System.out.println("time:" + sDateFormat.format(new Date()));
    }

    public static void main(String[] args) {
        //Proxy.newProxyInstance();
    }
}
