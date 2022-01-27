package NetworkProGramming;
import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        
        try{
        URL ud = new URL("http://wwww.example.com:80/index.html");
        System.out.println("protocol: "+ ud.getProtocol());
        System.out.println("host: "+ud.getHost());
        System.out.println("file: "+ud.getFile());
        System.out.println("path: "+ud.getPath());
        System.out.println("port: "+ud.getPort());
            
    }catch(Exception e) {
            System.out.println(e);
    }
        
   }  
}
