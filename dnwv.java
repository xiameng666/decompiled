import java.util.ArrayList;

public final class dnwv implements gftc {
    @Override  // gftc
    public final boolean a(Object object0) {
        ibuq.f(((dxev)object0), "<this>");
        hkhr hkhr0 = ((dxev)object0).c;
        if(hkhr0 == null) {
            hkhr0 = hkhr.b;
        }
        hfuo hfuo0 = hkhr0.n;
        ibuq.e(hfuo0, "getExistingPaymentMethodActionsList(...)");
        ArrayList arrayList0 = new ArrayList(ibpo.q(hfuo0, 10));
        for(Object object1: hfuo0) {
            hkid hkid0 = hkid.b(((hkhs)object1).c);
            if(hkid0 == null) {
                hkid0 = hkid.z;
            }
            arrayList0.add(hkid0);
        }
        if(arrayList0.isEmpty()) {
            return false;
        }
        for(Object object2: arrayList0) {
            switch(((hkid)object2).ordinal()) {
                case 6: 
                case 7: 
                case 8: {
                    return true;
                }
            }
            continue;
        }
        return false;
    }
}

