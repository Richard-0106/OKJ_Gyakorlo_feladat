
package program;

import java.time.LocalDate;
import java.util.ArrayList;


public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate dt = LocalDate.parse("2023-11-01");
        Galeria g1=new Galeria();
        g1.felvesz(new KiallitasTargy("Marcell", "valami cim"));
        g1.felvesz(new KiallitasTargy(dt, "Ádám", "Föld alatti egerek"));
        g1.felvesz(new KiallitasTargy("Jakab", "Szép az ég"));
        g1.felvesz(new Festmeny("János", "virágok", ""));
        
        System.out.println(g1.toString());
        Galeria[] galeria={g1};
        
        System.out.println("cim szerinti rendezés:");
        System.out.println(g1.CimSzerintRendez());
        
        System.out.println("Keszítő szerint rendezés");
        System.out.println(g1.KeszitoSzerintRendez());
    }
     public static void kiir(Galeria[] galeria){
         for (Galeria galeria1 : galeria) {
             System.out.println(galeria1);
         }
     }
}
