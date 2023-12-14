import java.io.IOException;

CH=8881
CT =8882
CA =8883


public class ProcessusHopital {

    SyncSocket CH, CA;

    public ProcessusHopital(SyncSocket ch, SyncSocket ca) {
        this.CH = ch;
        this.CA = ca;
    }

    /**
     * Premiere branche
     * @throws IOException
     */
    public void go() throws IOException{
        System.out.println("Etat 0");
        CH.receive("demandeRdzVs");
        System.out.println("Etat 1");
        CH.send("code");
        System.out.println("Etat 2");
        CA.receive("typeMedecin");
        System.out.println("Etat 3");
        CA.send("code");
        System.out.println("Etat 4");
        CA.send("demandePlages");
        System.out.println("Etat 5");
        CA.receive("plagesLibres");
        System.out.println("Etat 6");
        double d = Math.random()*1000;

        if (d<50){
            System.out.println("Etat 7");
            CH.send("heureRdzVs");
            System.out.println("Etat 8");
        }else{
            System.out.println("Etat 9");
            CH.send("pasDeRdzVs");
            System.out.println("Etat 10");
        }

    }




    
}
