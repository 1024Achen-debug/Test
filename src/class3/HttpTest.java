package class3;

import java.net.MalformedURLException;
import java.net.URL;

public class HttpTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baidu.com/");
            String host = url.getHost();
            int port = url.getPort();
            System.out.println("百度Host:"+host+",端口:"+port);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
