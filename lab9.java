import java.net.*;

public class lab9 {
   public static void main(String[] args) 
   {
    String url = "http://fakebook.com";
    testProtocol(url);
   }

   public static void testProtocol(String url) {
    try {
        URL u = new URL(url);
        System.out.println(u.getProtocol()+" is supported");
    }
    catch(MalformedURLException ex) {
        ex.printStackTrace();
    }
   }
}
