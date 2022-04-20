/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Comparator;

/**
 *
 * @author Li.Richard
 */
public class KeszitoComparator implements Comparator<KiallitasTargy>{

    @Override
    public int compare(KiallitasTargy o1, KiallitasTargy o2) {
         return o1.getKeszito().compareTo(o2.getKeszito());
    }
    
}
