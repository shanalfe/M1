public class OD3Impl implements OD3I {

    private boolean appelE = false;
    private boolean appelF = false;
    
    public void E() {
        System.out.println("E");
        appelE = true;
        notifyAll();
    }
    public void F() {
        System.out.println("F");
        appelF = true;
        notifyAll();
    }

    public synchronized void waitE(){
        while (!appelE ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void waitF(){
        while (!appelF ){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
