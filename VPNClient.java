import java.io.*;
import java.net.*;

public class VPNClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 9999);
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("Hello from client");

            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(dis.readUTF());

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}