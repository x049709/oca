package allchapters;
import java.util.*;
public class Finalizer {
    private static List objects = new ArrayList();
    public static final void  main(String[] args) {
    	System.out.println("Main running");
       objects = null;
        Finalizer f = new Finalizer();
    	System.out.println("Main running" + f);
    }
    protected void finalize() {
    	System.out.println("Finalizer running");
           objects.add(this);
    }

}
