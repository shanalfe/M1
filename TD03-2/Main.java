import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Registry reg = LocateRegistry.createRegistry(1010); // création sur le site local
       
         //Utilisation local
         // Registry reg = LocateRegistry.createRegistry(1099); // création sur le site local
        // OD1I o1 = new OD1Impl(); // je créé
         //reg.rebind("OD1I", o1); // je publie, ici on met un identifiant, par défaut, ce sera le nom de l'interface
        OD2I o2 = new OD2Impl(); 
        reg.rebind("OD2I", o2); 

        Thread.sleep(10000);

        //Les 2 autres, on va faire une recherche sur OD
       // Registry reg2 = LocateRegistry.getRegistry("IP_P2"); // création sur le site local
        //Registry reg3 = LocateRegistry.getRegistry("IP_3");

        Registry reg1 = LocateRegistry.getRegistry("192.168.137.8"); // Adresse mathis
        Registry reg3 = LocateRegistry.getRegistry("192.168.137.1"); // Adresse Arthur 

       // OD2I o2 = (OD2I) reg2.lookup("O2DI");
      //  OD3I o3 = (OD3I) reg3.lookup("O3DI");

        OD1I o1 = (OD1I) reg1.lookup("O1DI");
        OD3I o3 = (OD3I) reg3.lookup("O3DI");

       // new P1 (o1, o2, o3).start();
       new P2( o1, o2, o3).start();

        }
    
}
