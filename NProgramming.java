package np.edu.scst;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class NProgramming{  
    public static void main(String[] args){  

        try{  
            InetAddress ip = InetAddress.getLocalHost(); 
            System.out.println(ip);
            InetAddress  ia = InetAddress.getLocalHost();
            String str = ia.getHostAddress();
            System.out.println(str);
            InetAddress in = InetAddress.getByName("scst.edu.np");
            System.out.println("Ip address : " + in.getHostAddress());
            
            InetAddress[] al = InetAddress.getAllByName("scst.edu.np");
            System.out.println("Ip address : " + al);

        }catch(UnknownHostException e){System.out.println(e);}  
    }  

}
