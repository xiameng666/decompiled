import java.util.Comparator;

public final class csuu implements Comparator {
    @Override
    public final int compare(Object object0, Object object1) {
        ibuq.f(((gyve)object0), "device1");
        ibuq.f(((gyve)object1), "device2");
        gyvh gyvh0 = gyvh.b(((gyve)object0).f);
        if(gyvh0 == null) {
            gyvh0 = gyvh.g;
        }
        ibuq.e(gyvh0, "getDeviceStatus(...)");
        int v = csuv.a(gyvh0);
        gyvh gyvh1 = gyvh.b(((gyve)object1).f);
        if(gyvh1 == null) {
            gyvh1 = gyvh.g;
        }
        ibuq.e(gyvh1, "getDeviceStatus(...)");
        int v1 = ibuq.a(v, csuv.a(gyvh1));
        if(v1 == 0) {
            String s = ((gyve)object0).d;
            String s1 = ((gyve)object1).d;
            ibuq.e(s1, "getDisplayName(...)");
            return s.compareTo(s1);
        }
        return v1;
    }
}

