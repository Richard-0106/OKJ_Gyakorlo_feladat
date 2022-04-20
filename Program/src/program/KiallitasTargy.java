/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;

/**
 *
 * @author Li.Richard
 */
public class KiallitasTargy implements Comparable<KiallitasTargy>{
   private LocalDate datum;
   private String keszito;
   private String cim;
    public KiallitasTargy( String keszito, String cim) {
        this(LocalDate.now(), keszito, cim);
        
 
    }
    public KiallitasTargy(LocalDate datum, String keszito, String cim) {
        
        this.keszito = keszito;
        this.cim = cim;
        if(!(datum.isEqual(LocalDate.now()))){
         try {
                throw new IOException();
            } catch (IOException ex) {
                System.err.println("csak a mai dátumig adhatja meg a dátumot");
            }
        } else{
            this.datum=datum;
        }
               
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String getKeszito() {
        return keszito;
    }

    public String getCim() {
        return cim;
    }

    @Override
    public String toString() {
        return "KiallitasTargy{" + "datum=" + datum + ", keszito=" + keszito + ", cim=" + cim + '}';
    }

    @Override
    public int compareTo(KiallitasTargy o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
