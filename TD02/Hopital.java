import java.io.IOException;

public class Hopital {

    public static void main(String[] args) throws IOException {
        SyncSocket CH = new SyncSocket(args[0], 8881);
        SyncServerSocket ss = new SyncServerSocket(8883);
        SyncSocket CA = ss.accept();

        (new ProcessusHopital(CH, CA)).go();

    }
    
}
