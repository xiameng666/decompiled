import java.util.Comparator;

final class dpiy implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        int v1;
        hkhh hkhh0 = ((hkhr)object0).q;
        if(hkhh0 == null) {
            hkhh0 = hkhh.a;
        }
        int v = 0x7FFFFFFF;
        if((hkhh0.b & 2) == 0) {
            v1 = 0x7FFFFFFF;
        }
        else {
            hkhh hkhh1 = ((hkhr)object0).q;
            if(hkhh1 == null) {
                hkhh1 = hkhh.a;
            }
            hkir hkir0 = hkhh1.g == null ? hkir.a : hkhh1.g;
            v1 = (hkir0.j == null ? hkil.a : hkir0.j).e;
        }
        hkhh hkhh2 = ((hkhr)object1).q;
        if(((hkhh2 == null ? hkhh.a : hkhh2).b & 2) != 0) {
            if(hkhh2 == null) {
                hkhh2 = hkhh.a;
            }
            hkir hkir1 = hkhh2.g == null ? hkir.a : hkhh2.g;
            v = (hkir1.j == null ? hkil.a : hkir1.j).e;
        }
        return v1 - v;
    }
}

