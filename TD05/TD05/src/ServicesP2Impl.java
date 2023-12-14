import MessageVide;

public class ServicesP2Impl extends ServicesP2ImplBase{
    private boolean appelG = false;
    /**
     * message asynchrone donc on utilise void
     * @return
     */
   @override
    public syncronized void g(MessageVide req, StreamObserver<MessageVide> rep){
       System.out.prinln("G");
       appelG = true;
       notifyAll();
        /*on utilise setResultat pour les paramètres*/
       MessageVide msg = MessageVide.newBuilder().build();
       rep.onNext(mesg);
       rep.onCompleted();

    }

    @override
    public void waitG(MessageVide req, StreamObserver<MessageVide> rep){
        while (!appelG ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /*pas besoin du build car c'est le même paquet
        * si int et on veut renvoyer la factoriel du int, on build car ce n'est
        * pas le même paquet*/
        rep.onNext(req); // Obligé de faire le onNext et completed sinon bloqué de l'autre coté
        rep.onCompleted();
    }

}