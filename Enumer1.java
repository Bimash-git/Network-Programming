// find host name using 

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class Enumer1 {
    public static void main(String[] args) throws SocketException {
        NetworkInterface in = NetworkInterface.getByName("lo");
        Enumeration<InetAddress> emu = in.getInetAddresses();

        while(emu.hasMoreElements()) {
            InetAddress inetAddress = emu.nextElement();
        }

        String hostname = inetAddress.getHostAddress();
        System.out.println("host" + hostname);
    }
}


