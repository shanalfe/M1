import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;

public class SyncSocket extends Socket {
    private Socket s;
    private BufferedReader in;
    private PrintWriter out;

    public SyncSocket (Socket s) throws IOException {
        this.s = s;
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out = new PrintWriter(s.getOutputStream(), true);
    }

    public SyncSocket (String host, int port) throws IOException {
        this(new Socket(host, port));
    }

    /**
     * Envoi d'un message
     * @param msg
     * @throws IOException
     */
    public synchronized void send(String msg) throws IOException {
        //A compléter
        out.println(msg); // Asynchrone, j'envoie un message et j'attends un retour
        in.readLine(); // renvoie une chaine de caractère à cause du BufferedReader
        //Ex : on vérifie que le message envoyé soit le même que celui envoyé
        boolean ok = false;
        while (!ok) {
            String rep = in.readLine();
            if (rep.equals(msg)) {
                ok = true;
            }
        }
    }

    /**
     * Réception d'un message 
     * @param msg
     * @throws IOException
     */
    public synchronized void receive (String msg) throws IOException{
        //A compléter
        while (true){
             String rep = in.readLine();
                if (rep.equals(msg)) {
                    out.println(msg); // renvoie le message
                    break;
                }
        }
       

    }

    public synchronized String receive (Collection<String> msgs) throws IOException {
        return null;
        //A compléter 
        // aattend un messaghe bien précus dans la collection
        //j'arttends vrai ou faux 
    }
}
