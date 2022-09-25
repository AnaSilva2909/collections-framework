package Set;

import java.util.Comparator;
import java.util.Objects;

public class CoresArcoIris {
    public  String cor;

    public CoresArcoIris(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoresArcoIris that = (CoresArcoIris) o;
        return cor.equals(that.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cor);
    }


}

