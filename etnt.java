import java.util.Collection;

public final class etnt {
    public static final bboh a;

    static {
        etnt.a = bboh.b("TapAndPay", bbcu.aM);
    }

    public static final boolean a(String s, hgfj hgfj0) {
        hfuo hfuo0 = hgfj0.b;
        ibuq.e(hfuo0, "getElementList(...)");
        if((hfuo0 instanceof Collection) && hfuo0.isEmpty()) {
            return false;
        }
        for(Object object0: hfuo0) {
            if(ibzk.k(((String)object0), s, true)) {
                return true;
            }
        }
        return false;
    }
}

