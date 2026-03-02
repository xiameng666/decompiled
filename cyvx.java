import android.content.Context;
import java.util.Collection;
import java.util.HashSet;

public final class cyvx {
    public static cyxd a(cyxs cyxs0, String s) {
        if(!((ProtoLiteMessage)cyxs0).equals(cyxs.b) && !cyxs0.h.isEmpty()) {
            for(Object object0: cyxs0.h) {
                cyxd cyxd0 = (cyxd)object0;
                if(s.equals(cyxd0.c)) {
                    return cyxd0;
                }
            }
        }
        return null;
    }

    public static String b(cyxd cyxd0, String s, akp akp0) {
        String s1 = cyxd0 == null || (cyxd0.b & 8) == 0 ? null : cyxd0.h;
        return !hvpg.bM() || !gfta.c(s1) ? s1 : ((String)akp0.a(s));
    }

    public static String c(cyxs cyxs0, String s, akp akp0) {
        for(Object object0: cyxs0.h) {
            cyxd cyxd0 = (cyxd)object0;
            if(s.equals(cyxd0.c)) {
                return cyvx.b(cyxd0, s, akp0);
            }
        }
        return null;
    }

    public static HashSet d(cyxs cyxs0, Collection collection0) {
        HashSet hashSet0 = new HashSet();
        for(Object object0: cyxs0.h) {
            hashSet0.add(((cyxd)object0).c);
        }
        for(Object object1: collection0) {
            cyxs cyxs1 = (cyxs)object1;
            if((cyxs1.c & 2) != 0) {
                hashSet0.remove(cyxs1.e);
            }
        }
        return hashSet0;
    }

    public static boolean e(String s) {
        return hvpg.a.aY().fJ().b.contains(gfqz.d(s));
    }

    public static boolean f(Context context0, cyxd cyxd0) {
        return cyvx.g(context0, cyxd0, new cyvv());
    }

    public static boolean g(Context context0, cyxd cyxd0, akp akp0) {
        boolean z = true;
        if(hvpp.u()) {
            String s = cyvx.b(cyxd0, cyxd0.c, akp0);
            if(s == null || !cyvx.m(context0, s, cyxd0.c)) {
                z = false;
            }
            if(!z) {
                ((ggtj)cyjh.a.d().ar(0x204F)).B("TriangleNodeUtils, peripheral does not support switch, %s", cyus.i(cyxd0));
            }
        }
        return z;
    }

    public static boolean h(cyxd cyxd0, cyxd cyxd1) {
        String s = (cyxd0.b & 0x400) == 0 ? cyxd0.c : cyxd0.n;
        String s1 = (cyxd1.b & 0x400) == 0 ? cyxd1.c : cyxd1.n;
        ((ggtj)cyjh.a.d().ar(0x2050)).R("TriangleNodeUtils: isPeripheralTheSame remote device=%s, local device=%s", fgjo.c(s), fgjo.c(s1));
        return s.equals(s1);
    }

    public static boolean i(Context context0, cyxd cyxd0) {
        return cyvx.j(context0, cyxd0, cyxd0.c);
    }

    public static boolean j(Context context0, cyxd cyxd0, String s) {
        if(cyxd0 != null && (cyxd0.b & 0x200) != 0) {
            return cyxd0.m;
        }
        if(hvpp.bq()) {
            cyrp cyrp0 = new cyrp(context0);
            if(hvpg.bK() && cyrp0.p(s)) {
                ((ggtj)cyjh.a.d().ar(0x2052)).x("TriangleNodeUtils: isPeripheralToggleOn peripheral without toggle state but support sass toggle, check sass enable state");
                return cyrp0.q(s);
            }
            ((ggtj)cyjh.a.d().ar(0x2051)).x("TriangleNodeUtils: isPeripheralToggleOn peripheral is not a sass device or no sass toggle");
        }
        return hvpp.av() || hvpp.aw();
    }

    public static boolean k(Context context0, String s) {
        if(s == null) {
            ((ggtj)cyjh.a.g().ar(0x2055)).x("TriangleNodeUtils: isSassDevice peripheral with null address");
            return false;
        }
        if(hvpp.bq()) {
            cyrp cyrp0 = new cyrp(context0);
            if(hvpg.bK() && cyrp0.p(s)) {
                ((ggtj)cyjh.a.d().ar(0x2054)).B("TriangleNodeUtils: peripheral is sass device with %s", fgjo.c(s));
                return true;
            }
        }
        ((ggtj)cyjh.a.d().ar(0x2053)).B("TriangleNodeUtils: Peripheral is not sass device with %s", fgjo.c(s));
        return false;
    }

    public static boolean l(cyxs cyxs0) {
        if(new hfuh(cyxs0.m, cyxs.a).contains(cyxa.c)) {
            ((ggtj)cyjh.a.d().ar(0x2057)).R("TriangleNodeUtils: isSassEnabledForTriangleCalling find %s with %s enable sass", cyxs0.d, fgjo.c(cyxs0.e));
            return true;
        }
        ((ggtj)cyjh.a.d().ar(0x2056)).B("TriangleNodeUtils: isSassEnabledForTriangleCalling nearby node %s not enable sass", cyxs0.d);
        return false;
    }

    public static boolean m(Context context0, String s, String s1) {
        String s2 = gfqz.d(s);
        return gxvv.a.contains(s2) || hvpp.h() && cyvx.k(context0, s1) || hvpg.a.aY().fI().b.contains(gfqz.d(s));
    }
}

