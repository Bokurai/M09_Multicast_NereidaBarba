import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.nio.ByteBuffer;

public class ServerParaula {

    MulticastSocket socket;
    InetAddress multicastIP;
    int port;
    boolean continueRunning = true;
    Paraula emu;

    public ServerParaula(int portValue, String strIp) throws IOException {
        socket = new MulticastSocket(portValue);
        multicastIP = InetAddress.getByName(strIp);
        port = portValue;
        emu = new Paraula();
    }

    public void runServer() throws IOException{
        DatagramPacket packet;
        byte [] sendingData;

        while(continueRunning){
            sendingData = null;
            packet = new DatagramPacket(sendingData, sendingData.length,multicastIP, port);
            socket.send(packet);
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.getMessage();
            }
        }
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        //Canvieu la X.X per un número per formar un IP.
        //Que no sigui la mateixa que la d'un altre company
        ServerParaula serverParaula = new ServerParaula(5557, "224.0.11.150");
        serverParaula.runServer();

    }
}