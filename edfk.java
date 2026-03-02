import java.util.Comparator;

public final class edfk implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        hfwn hfwn0 = ((dynw)object1).f;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        long v = hfwn0.b;
        hfwn hfwn1 = ((dynw)object0).f;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        return Long.compare(v, hfwn1.b);
    }
}

