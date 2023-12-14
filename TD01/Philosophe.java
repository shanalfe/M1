public class Philosophe {
    
    private JTupleSpace table;
    private JTuple, FG, FD;

    public Philosophe(JTupleSpace t, JTuple fg, JTuple fd){
        table = t;
        FG = fg;
        FD = fd;
    }

    public void run(){
        while(true){

            table.EXT(FG); //extrait 
            table.EXT(FD); 
            sleep(temps_en_milliseconde); //mange
            table.ECR(FG);
            table.ECR(FD);
            sleep(temps_en_milliseconde); //reflechit

        }
       

    }

    
}
