import java.io.*;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class Website {
    public static void main(String[] args) {
        try {
            URL url = new   URL("https://www.youtube.com");
            
            BufferedReader reader = new BufferedReader(
                new InputStreamReader(url, openStream(), StandardCharsets.UTF_8));
                

            )
        }
    }
}
