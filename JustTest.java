/**
 * Created by xuwei on 2016/11/21.
 */
public class JustTest {
    public static void main(String[] args) {
        String [] str = {"1","2","3"};
        str[1] = "\0";
        System.out.println(str.length);
        System.out.println(str[1]);
        System.out.println(str[2]);
    }
}
