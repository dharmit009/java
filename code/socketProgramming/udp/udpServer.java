import java.net.*;
import java.io.*;

public class udpServer{
    public static void main(String args[]){

      try{
        DatagramSocket ds = new DatagramSocket(333);
        byte[] b = new byte[100];

        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);

        String msg = new String(b);
        System.out.println(msg);
      }
      catch(Exception e){
        System.out.println(e);
      }

    }
}
