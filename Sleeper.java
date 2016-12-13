/**
 * Created by xuwei on 2016/11/2.
 */
public class Sleeper extends Thread {
    private int duration;

    public Sleeper(String name, int Sleep) {
        super(name);
        this.duration = Sleep;
        start();
    }
    public void run() {
        try {
            sleep(duration);
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted." + "isInterrupted():" + isInterrupted());
            return;
        }
        System.out.println(getName() + " has awakened");
    }
}
