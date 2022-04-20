
package program;

import java.time.LocalDate;

public class Festmeny extends KiallitasTargy {
    private String fajl;

    public Festmeny(String keszito, String cim,String fajl) {
        super(keszito, cim);
        this.fajl=fajl;
    }


    public String getFajl() {
        return fajl;
    }

    @Override
    public String toString() {
        return "Festmeny{" + "fajl=" + fajl + '}';
    }

  
    
   
    
}
