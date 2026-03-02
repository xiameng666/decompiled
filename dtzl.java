import java.util.HashMap;
import java.util.Map;

public final class dtzl {
    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public static gtvm a(String s, String s1) {
        for(Object object0: hwly.a.j().q().b) {
            gtvm gtvm0 = (gtvm)object0;
            if(gtvm0.c.equals(s) && gtvm0.h.contains(s1)) {
                return gtvm0;
            }
        }
        return null;
    }

    public static Map b(gtvm gtvm0) {
        hfuo hfuo0 = gtvm0.e;
        Map map0 = new HashMap();
        for(Object object0: hfuo0) {
            ((HashMap)map0).put(((gtvp)object0).c, ((gtvp)object0).d);
        }
        return map0;
    }
}

