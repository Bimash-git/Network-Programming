import java.io.IOException;
import java.net.InetAddress;

public class Reachability {
    public static void main(String[] args) {
        try {
            InetAddress net = InetAddress.getByName("22.22.22.22");
            if (net.isReachable(100)) {
                System.out.println(100);
            }
            else {
                System.out.println("Failed");
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }   
}
