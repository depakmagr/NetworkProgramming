import java.net.*;
import java.io.*;
    public class ClientChat {
        public static void main(String[] a){
            try{
                try{
                    Socket s=new Socket("192.168.99.31",8080); // Socket()
                    System.out.println("Server Connected : "+s); // Connect()

/*** DataInputStream writes formatted binary data. DataOutputStream reads formatted binary data. ***/
                    DataInputStream din=new DataInputStream(s.getInputStream()); // Read ()
                    DataOutputStream dout=new DataOutputStream(s.getOutputStream()); // Write

/*** BufferedReader reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines ***/
                    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    String s1;
                    do{
                        s1=br.readLine();
                        dout.writeUTF(s1);
                        dout.flush();
                        System.out.println("Server Message: I am from server. "+din.readUTF());
                    }while(!s1.equals("stop"));

                    s.close();
                }
                catch(Exception e)
                {
                    System.out.println(e);
                }

            }
            catch (Exception ex) {
                System.err.println(ex);
            }

        }

    }

