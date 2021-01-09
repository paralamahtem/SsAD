import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class ServerControl {
    private static MulticastSocket socket;
    private static InetAddress address;
    private static byte[] buffer;
    private static DatagramPacket packet;
    private static String str;
    private  static List <String> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        System.out.println("Ожидание сообщения от сервера");
        try {
            //создание объекта MltSocket чтобы получать данные от
            //используя адрес порта
            socket = new MulticastSocket(1502);
            address = InetAddress.getByName("233.0.0.1");
            socket.joinGroup(address);
            while (true) {
                buffer = new byte[256];
                packet = new DatagramPacket(buffer, buffer.length);
                // получаем данные от сервера
                socket.receive(packet);
                str = new String(packet.getData());
                if (list.contains(str)) {
                    list.add(str);
                }
                System.out.println("Получено сообщение: " + str.trim());
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.leaveGroup(address);
            } catch (IOException e) {
                e.printStackTrace();
            }
            socket.close();
        }
    }

    public static void sendMessage (List <String> list) {
        try {
            ServerSocket serverSocket = new ServerSocket(1500);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Connection accepted from " +
                        clientSocket.getInetAddress().getHostAddress());
                // Получение выходного потока, связанного с объектом Socket
                ObjectOutputStream out =
                        new ObjectOutputStream(clientSocket.getOutputStream());

                // Запись объекта в выходной поток
                out.writeObject(list);
                out.close();


                System.out.println("Старт сервера ");
            }
    } catch (Exception e) {
            e.printStackTrace();
        }
   }
}