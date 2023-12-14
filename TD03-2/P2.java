import java.rmi.RemoteException;

public class P2 {
 
    /*
     * Invoquer la méthode A() de P1 ;
2. Attendre que la méthode B() de P1 soit invoquée ; 3. Invoquer la méthode E() de P3 ;
4. Attendre que la méthode G() soit invoquée ;
5. Attendre que la méthode C() de P1 soit invoquée ; 6. Invoquer la méthode F() de P3 ;
7. Se terminer.
     */

    private OD1I o1;
    private OD2I o2;
    private OD3I o3;

    public P2(OD1I pO1, OD2I pO2, OD3I pO3) {
        o1 = pO1;
        o2 = pO2;
        o3 = pO3;
    
    }

    public void start () throws RemoteException{
        o1.A(); // Invocation méthode A() de P1
        o1.waitB(); // Attendre que la méthode B() de P1 soit invoquée
        o3.E(); // Invoquer la méthode E() de P3
        o2.G(); // Attendre que la méthode G() soit invoquée
        o1.waitC(); // Attendre que la méthode C() de P1 soit invoquée
        o3.F(); // Invoquer la méthode F() de P3
        


    }
}
