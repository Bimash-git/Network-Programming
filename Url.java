import java.net.MalformedURLException;
import java.net.URL;

public class Url {
    public static void main(String[] args) {
        try {
            URL u = new URL("https://drive.google.com/drive/my-drive");


            System.out.println("The URL is "+ u);
            System.out.println("The Scheme is "+ u.getProtocol());
            System.out.println("The user info is "+ u.getUserInfo());
            String host = u.getHost();
            if(host != null) {
                int atSign = host.indexOf("@");
                if(atSign != 1) host = host.substring(atSign+1);
                System.out.println("The host is "+ host);

            }
            else {
                System.out.println("The host is null.");
            }

            System.out.println("THe port is" + u.getPort());
            System.out.println("THe path is"+ u.getPath());
            System.out.println("The ref is "+u.getRef());
            System.out.println("THe query string is "+ u.getQuery());
            
        }
        catch (MalformedURLException ex) {
            System.out.println(ex);
        }
    }
}
