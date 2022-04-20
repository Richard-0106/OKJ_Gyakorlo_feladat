/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Galeria implements Comparable<KiallitasTargy>,Iterable<Galeria>{
    private ArrayList<KiallitasTargy> targyak;

    public Galeria() {
        targyak = new ArrayList<>();
    }
    public void felvesz(KiallitasTargy targy){
        targyak.add(targy);
    }
     public List<KiallitasTargy> CimSzerintRendez() {

        ArrayList<KiallitasTargy> cimlista = new ArrayList(targyak);
        Collections.sort(cimlista, new CimComparator());
        return cimlista;
    }
     public List<KiallitasTargy> KeszitoSzerintRendez() {

        ArrayList<KiallitasTargy> keszitolista = new ArrayList(targyak);
        Collections.sort(keszitolista, new KeszitoComparator());
        return keszitolista;
    }

    @Override
    public String toString() {
        return "Galeria{" + "targyak=" + targyak + '}';
    }

    @Override
    public int compareTo(KiallitasTargy o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Galeria> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
