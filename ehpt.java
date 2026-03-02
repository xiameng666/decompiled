import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public final class ehpt implements ehps {
    public static final String a = "UserServiceIdProvider";
    public static final Set b;
    private static final bboh c;

    static {
        ehpt.c = bboh.b("UserServiceIdProvider", bbcu.dO);
        ehpt.b = ibqg.c(new String[]{"apkappcontext", "app", "app_network"});
    }

    @Override  // ehps
    public final hgiq a(String[] arr_s) {
        hgiq hgiq1;
        if(arr_s != null && arr_s.length != 0) {
            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
            Iterator iterator0 = ibug.a(arr_s);
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                String s = (String)object0;
                if(s == null) {
                    ((ggtj)ehpt.c.i()).x("null attributions tag");
                }
                else if(!ehpt.b.contains(s)) {
                    hgiq hgiq0 = (hgiq)bbdd.a.get(s);
                    if(hgiq0 == null) {
                        ((ggtj)ehpt.c.i()).B("no service found for attribution tag : %s", s);
                    }
                    else {
                        hgiq1 = hgiq0;
                        goto label_16;
                    }
                }
                hgiq1 = null;
            label_16:
                if(hgiq1 == null) {
                    ((ggtj)ehpt.c.i()).B("no service found for attribution tag : %s", new gpnd(gpnc.a, s));
                    return null;
                }
                linkedHashSet0.add(hgiq1);
            }
            if(linkedHashSet0.isEmpty()) {
                ggtj ggtj0 = (ggtj)ehpt.c.i();
                String s1 = ibpg.an(arr_s, null, null, null, null, 0x3F);
                ggtj0.B("no matching service found for attribution tags : %s", new gpnd(gpnc.a, s1));
                return null;
            }
            if(linkedHashSet0.size() != 1) {
                ggtj ggtj1 = (ggtj)ehpt.c.i();
                String s2 = ibpg.an(arr_s, null, null, null, null, 0x3F);
                ggtj1.B("attribution tags belong to different services : %s", new gpnd(gpnc.a, s2));
                return null;
            }
            return (hgiq)ibpo.Z(linkedHashSet0);
        }
        ((ggtj)ehpt.c.i()).x("null/empty attributions tags");
        return null;
    }
}

