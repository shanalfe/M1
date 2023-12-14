public class JTupleSpace {
    
    private List<JTuple> multiEnsemble;

    public JTupleSpace(JTuple... t){
        multiEnsemble = new ArrayList <>(Arrays.asList(t));
    }

    /**
     * Ecriture dans l'espace de tuple
     */
   synchronized public void ECR(JTuple t){ 
        multiEnsemble.add(t); // ajoute à la liste
        notifyAll(); //Réveil les autres processus
    }

    /**
     * Extraction
     */
    public synchronized JTuple EXT(JTuple t){ 

      while(!multiEnsemble.contains(t)){ //on vérifie si l'objet est là
        wait(); //libère le verrou
      }
      JTuple rep = multiEnsemble.get(multiEnsemble.indexOf(t));
      multiEnsemble.remove(t);
      return rep;


    }

    /**
     * Lecture
     */
    public JTuple LEC(JTuple t){ 
        while (!mutliEnsemble.contains(t)){
            wait();
        }
        return multiEnsemble.get(multiEnsemble.indexOf(t));

    }

    public String toString(){
        return multiEnsemble.toString();
    }

    

    
    

    
}