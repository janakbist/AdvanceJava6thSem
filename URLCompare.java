package NetworkProGramming;
import java.net.*;
public class URLCompare {
    public static void main(String[] args) {
        try{
        URL u1 = new URL("http://wwww.example.com");
        URL u2 = new URL("http://www.example.com:80");
        
//        if(u1.equals(u2)) {
//            System.out.println(u1+" Equals to "+u2);
//        }
//        else{
//            System.out.println("Different UrL");
//        }
//        }
if(u1.sameFile(u2)){
    System.out.println("Equals");
}
else {
    System.out.println("Not Equals");
}
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
