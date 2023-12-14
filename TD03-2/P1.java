/*
 * Ce n'est pas le processus qui fait le wait, c'est l'objet qui fait le wait
 * extends thread pour solution locale
 */

import java.rmi.RemoteException;

public class P1 {
   /*
    * 1. A4t.teInvdorqeueqruleamlaétmhoédtehGodedAe(P)2s,oitinvoquée;
5. Attendre l’invocation de C , 6. Attendre l’invocation de F , 7. Se terminer.
G()
 et C .
  1
2. Attendre que la méthode B() soit invoquée ;
3. Attendre que la méthode E() de P3 soit invoquée ; 4. Invoquer la méthode G() de P2 ;
5. Attendre que la méthode C() soit invoquée ;
6. Attendre que la méthode F() de P3 soit invoquée ; 7. Se terminer.

    */

    private OD2I o2;
    private OD1I o1;
    private OD3I o3;

    /**
     * Constructeur de P1
     * @param pO1
     * @param pO2
     * @param pO3
     */
    public P1(OD1I pO1, OD2I pO2, OD3I pO3) {
        o2 = pO2;
        o1 = pO1;
        o3 = pO3;
    }

    /**
     * Invocation
     * run() pour solution locale 
     * @throws RemoteException
     * remoteException pour remonter les exceptions (factoriser) sinon on traite les exceptions en local
     */
    public void start () throws RemoteException{
        o1.waitA();
        o1.waitB();
        o3.waitE();
        o2.G();
        o1.waitC();
        o3.waitF();
    }

  




}