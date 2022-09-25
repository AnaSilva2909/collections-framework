package Set;

import java.util.Comparator;

public class ComparatorCores implements Comparator<CoresArcoIris> {
    @Override
    public int compare(CoresArcoIris c1, CoresArcoIris c2) {

      int cores =  c1.getCor().compareTo(c2.getCor());
        return cores;
    }
}

class ComparatorCoresInversa implements Comparator<CoresArcoIris> {
    @Override
    public int compare(CoresArcoIris c1, CoresArcoIris c2) {

        int cores = c1.getCor().compareTo(c2.getCor());
        return cores;
    }
}


