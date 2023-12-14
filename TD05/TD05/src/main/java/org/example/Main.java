package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.management.MBeanServerBuilder;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        ServicesP2ImplBase od2 = new ServicesP2Impl();
       Server serveur = ServerBuilder.
               forPort(1099).
               addService(od2).
               build().start();

       System.out.println("Le serveur est lancé");
       Thread.sleep(5000); // on attend le démarrage des autres

        ManagedChannel c1 = ManagedChannelBuilder
                .forAdress("@IP_P1", 1099).usePlaintex.build();

        ManagedChannel c3 = ManagedChannelBuilder
                .forAdress("@IP_P3", 1099).usePlaintex.build();

        ServiceP1BlockingStub od1 = ServicesP1Grpc.newBlockingStub(c1);
        ServiceP3BlockingStub od3 = ServicesP3Grpc.newBlockingStub(c1);

        (new ProcessusP2(od1, od2, od3)).start();

       serveur.awaitTerminaison();
    }
}