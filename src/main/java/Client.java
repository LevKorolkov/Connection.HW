import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Client {

    private static String host = "127.0.0.1";
    private static int port = 8070;

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            out.println("User\n" + "Host: localhost\n\n\n");
            String resp = in.readLine();
            System.out.println(resp);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


}
