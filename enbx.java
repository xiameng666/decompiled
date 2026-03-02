import java.util.Comparator;

public final class enbx implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v = hfyf.b(enby.c(((emmj)object1)), enby.c(((emmj)object0)));
        if(v != 0) {
            return v;
        }
        hfwn hfwn0 = ((emmg)((emmj)object1).g.get(0)).e;
        if(hfwn0 == null) {
            hfwn0 = hfwn.a;
        }
        hfwn hfwn1 = ((emmg)((emmj)object0).g.get(0)).e;
        if(hfwn1 == null) {
            hfwn1 = hfwn.a;
        }
        return hfym.a(hfwn0, hfwn1);
    }
}

