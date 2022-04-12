//
//  ____  _                          _  _     ___   ___   ___  
// |  _ \| |__   __ _ _ __ _ __ ___ (_)| |_  / _ \ / _ \ / _ \ 
// | | | | '_ \ / _` | '__| '_ ` _ \| || __|| | | | | | | (_) |
// | |_| | | | | (_| | |  | | | | | | || |_ | |_| | |_| |\__, |
// |____/|_| |_|\__,_|_|  |_| |_| |_|_|\___| \___/ \___/   /_/
//
//                 [     a.k.a Hmm009     ]            
// Author Name: Dharmit
// Github Profile: www.github.com/dharmit009
//

23
import java.net.*;
import java.io.*;

public class tcpServer{

  public static void main(String args[]){

    try{

      // create a server socket and bind it to a specific port ...
      ServerSocket ss = new ServerSocket(333);
      // Once you have created the socket ... start accepting
      // connections ...
      Socket s = ss.accept();

      // Buffer to read the message passed by the tcpClient ...
      DataInputStream ds = new DataInputStream(s.getInputStream());

      // converting those bytes into a utf readable format ...
      String mess = (String) ds.readUTF();
      System.out.println(mess);
    }

    catch(Exception e){
      e.printStackTrace();
    }

  }
}
