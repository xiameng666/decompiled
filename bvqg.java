import java.util.Comparator;
import java.util.List;

public final class bvqg implements Comparator {
    public final List a;

    public bvqg(List list0) {
        this.a = list0;
    }

    @Override
    public final int compare(Object object0, Object object1) {
        hgnj hgnj0 = ((hgni)object0).c;
        if(hgnj0 == null) {
            hgnj0 = hgnj.a;
        }
        List list0 = this.a;
        int v = list0.indexOf(hgnj0);
        hgnj hgnj1 = ((hgni)object1).c;
        if(hgnj1 == null) {
            hgnj1 = hgnj.a;
        }
        return v - list0.indexOf(hgnj1);
    }
}

