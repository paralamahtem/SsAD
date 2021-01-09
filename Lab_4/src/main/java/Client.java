import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Client {
    private static MulticastSocket socket;
    private static InetAddress address;
    private static byte[] buffer;
    private static DatagramPacket packet;
    private static String str;

    public static void main(String[] args) {
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
}