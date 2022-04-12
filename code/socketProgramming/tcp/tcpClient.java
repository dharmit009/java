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

import java.net.*;  // ServerSocket & Socket class.
import java.io.*;   // provides buffer

public class tcpClient{
  public static void main(String args[]){
    try{

      // creating a socket ...
      Socket s = new Socket("localhost", 333);
      System.out.println(s);

      // Output buffer using DataOutputStream ...
      DataOutputStream d1 = new DataOutputStream(s.getOutputStream());

      // write utf characters and sending them over to server ...
      d1.writeUTF("Hello, World!!");

      // closing unused buffers and connections ...
      d1.close();
      s.close();

    } // try block ...

    catch(Exception e){
      System.out.println(e);
    } //catch block ...

  }
}
