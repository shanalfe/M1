import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OD2Impl extends UnicastRemoteObject implements OD2I {

    private boolean appelG = false;

    public OD2Impl() throws RemoteException {
        super();
    }

    public synchronized void G() throws RemoteException{
        System.out.println("G");
        appelG = true;
        notifyAll();
    }

    public synchronized void waitG() throws RemoteException{
        while (!appelG ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
