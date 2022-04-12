import java.net.*;
import java.io.*;

public class udpClient{
  public static void main(String args[]){
    try{
      DatagramSocket ds = new DatagramSocket();
      byte [] b = "this is udp Client ".getBytes();
      InetAddress ip = InetAddress.getByName("localhost");
      int port = 333;
      DatagramPacket dp = new DatagramPacket(b, b.length, ip, port);
      ds.send(dp);
    }
    catch(Exception e){
      System.out.println(e);
    }

  }
}
