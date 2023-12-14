import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class StubObjetDistant {

   private int port;
   private String adresse;

   public StubObjetDistant (String ad, int p) {
      this.adresse = ad;
      this.port = p;
   }

   public ObjetParam2 M1 (ObjetParam1 arg) throws IOException, ClassNotFoundException{
        Socket s = new Socket(adresse, port);
        // envoyer et recevoir des objets
  ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());

        out.writeObject("M1");
        out.writeObject(arg);

        Object rep = in.readObject();
        in.close(); out.close(); s.close();
        return (ObjetParam2) rep;
   }
    

     public ObjetParam2 M2 (ObjetParam1 arg) throws IOException, ClassNotFoundException{
        Socket s = new Socket(adresse, port);
        // envoyer et recevoir des objets
        ObjectOutputStream out = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(s.getInputStream());

        out.writeObject("M2");
        out.writeObject(arg);

        Object rep = in.readObject();
        
        in.close(); out.close(); s.close();

        return (ObjetParam2) rep;
   }
}
