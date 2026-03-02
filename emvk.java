import java.util.Comparator;

public final class emvk implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        hfwn hfwn0 = ((gzrd)object0).c;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        long v = hfwn0.b;
        hfwn hfwn1 = ((gzrd)object1).c;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        long v1 = v - hfwn1.b;
        return v1 == 0L ? emvm.M(((gzrd)object0)) - emvm.M(((gzrd)object1)) : ((int)v1);
    }
}

