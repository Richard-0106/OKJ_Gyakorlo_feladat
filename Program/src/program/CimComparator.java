
package program;

import java.util.Comparator;

public class CimComparator implements Comparator<KiallitasTargy>{

    @Override
    public int compare(KiallitasTargy o1, KiallitasTargy o2) {
        return o1.getCim().compareTo(o2.getCim());
    }
    
}
