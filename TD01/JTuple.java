import java.util.Arrays;
import java.util.List;

/**
 * JTuple
 */
public class JTuple {

    private List<Object> contenu;

    public JTuple(Object... l){

        contenu = new ArrayList <>(Arrays.asList(1));
    }

    public boolean equals(Object o){
        return ((JTuple)o).contenu.equals(contenu);
    }

    public boolean match (JTuple t){
        return this.equals(t)
    }

    public String toString(){
        return contenu.toString();
    }
    
}
