import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class OD1Impl extends UnicastRemoteObject implements OD1I {

    private boolean appelA = false;
    private boolean appelB = false;
    private boolean appelC = false;


    /** Constructeur 
     * préciser que l'on lève une exception 
     * @throws RemoteException
    */
    public OD1Impl() throws RemoteException {
        super();
    }
    
    public synchronized void A() throws RemoteException {
        System.out.println("A");
        appelA = true;
        notifyAll();
    }
    public synchronized void B() throws RemoteException {
        System.out.println("B");
        appelB = true;
        notifyAll();
    }
    public synchronized void C() throws RemoteException {
        System.out.println("C");
        appelC = true;
        notifyAll();
    }

    /** Attente */
    public synchronized void waitA() throws RemoteException{
        while (!appelA ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void waitB() throws RemoteException{
        while (!appelB ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void waitC() throws RemoteException{
        while (!appelC ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
