import java.io.IOException;
import java.net.URL;

/**
 * Created by xuwei on 2016/11/14.
 */
public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://bim-uat.wanda-dev.cn");
            System.out.println(url.toString());
            System.out.println(url.getProtocol());
            System.out.println(url.getAuthority());
            System.out.println(url.getHost());
            System.out.println(url.getPath());
            System.out.println(url.getPort());
            System.out.println(url.getDefaultPort());
            System.out.println(url.getQuery());
            System.out.println(url.getRef());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
