import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuwei on 2016/11/17.
 */
public class Foo {

    private static Foo foo = new Foo();
    private static Map<Integer,Boolean> test =  new HashMap<Integer, Boolean>();
    private static int a;
    private Foo() {
        test.put(1, true);
        a = 1;
    }

    public static Foo getInstance() {
        return foo;
    }

    public static void main(String[] args) {
        Foo.getInstance();

    }
}
