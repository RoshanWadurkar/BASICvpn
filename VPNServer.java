import java.io.*;
import java.net.*;

public class VPNServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();

            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(dis.readUTF());

            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF("Hello from server");

            serverSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
