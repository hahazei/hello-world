import java.lang.reflect.Constructor;

/**
 * Created by xuwei on 2016/11/14.
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Constructor con1 = String.class.getConstructor(StringBuffer.class);
        String str2 = (String) con1.newInstance(new StringBuffer("can"));
        System.out.println(str2.charAt(2));

    }
}
