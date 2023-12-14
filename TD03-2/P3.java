import java.rmi.RemoteException;

public class P3 {
    /*
     * 
1. Attendre que la méthode A() de P1 soit invoquée ; 2. Invoquer la méthode B() de P1 ;
3. Attendre que la méthode E() soit invoquée ;
4. Attendre que la méthode G() de P2 soit invoquée ; 5. Invoquer la méthode C() de P1 ;
6. Attendre que la méthode F() soit invoquée ; 7. Se terminer.

     */

    private OD1I o1;
    private OD2I o2;
    private OD3I o3;

    public P3 (OD1I pO1, OD2I pO2, OD3I pO3) {
        o1 = pO1;
        o2 = pO2;
        o3 = pO3;
    }

    public void start() throws RemoteException{
        o1.waitA();// attendre que la methode A() de P1 soit invoquée
        o1.B();// invoquer la methode B() de P1
        o3.waitE();// attendre que la methode E() soit invoquée
        o2.waitG();// attendre que la methode G() de P2 soit invoquée
        o1.C();// invoquer la methode C() de P1
        o3.waitF(); // attendre que la methode F() soit invoquée
        
    }

}
