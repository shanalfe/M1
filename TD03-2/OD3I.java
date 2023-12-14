import java.rmi.Remote;

public interface OD3I extends Remote {

    public void E() throws java.rmi.RemoteException;
    public void F() throws java.rmi.RemoteException;
    public void waitE()    throws java.rmi.RemoteException;
    public void waitF()   throws java.rmi.RemoteException;
    
}
