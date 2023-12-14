
public class ProcesseurP2{

    private ServicesP1Grps.ServicesP1Blocking od1;
    private ServicesP3Grps.ServicesP3Blocking od3;
    private ServicesP2ImplBase od2;
    private MessageVide msgVide;
    private StreamObserver<MessageVide> rep;

    public ProcessusP2();

    public processusP2(ServicesP1BlockingStub o1, ServicesP2ImplBase od2, ServicesP3ImplBase o3){
        od1 =o1;
        od2=o2;
        od3=o3;
        msgVide = MessageVide.newBuilder.build();
        rep. = new StreamObserver<>(){
          @override
          public void onNext(MessageVide v){}
            @override
            public void onError(Throwable thrwbl){}
            @override
            public void onCompleted(){}
        };

    }

    public void start(){
        od1.a(msgVide); // pas de paramètre 
        od1.waitB(MessageVide.newBuilder().build()); //synchorne
        od3.e(msgVide);
        od2.waitG(msgvide, rep) //asynchrone
    }

}