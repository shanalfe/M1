import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SkeletonObjetDistant {
    private int port;
    private ObjetDistant od;

    public SkeletonObjetDistant(ObjetDistant o, int p) {
        this.port = p;
        this.od = o;
    }


    public void run(){
        ServerSocket ss = new ServerSocket(port);
        while(true){
            Socket s = ss.accept();
            traiterRequete(s);
        }
    }


    private void traiterRequete(Socket s){
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());

        String nom = (String) in.readObject();
        if(nom.equals("M1"){
            ObjectParam1 arg = (ObjectParam1)in.readObject();
            ObjetParam2 rep = od.M1(arg);

            out.writeObject(rep);
        }else{
             ObjectParam2 arg = (ObjectParam2)in.readObject();
            ObjetParam1 rep = od.M2(arg);

            out.writeObject(rep);
        }

        in.close(); out.close(); s.close();
    }
}
