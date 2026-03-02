import java.util.LinkedHashSet;

public final class bgms {
    public static String a(gqmd gqmd0) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        gged_interceptors gged0 = gqmd0.c();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            heqa heqa0 = ((bedg)gged0.get(v1)).e.u;
            if(heqa0 == null) {
                heqa0 = heqa.a;
            }
            String s = bgms.b(heqa0);
            if(!s.isEmpty()) {
                linkedHashSet0.add(s);
            }
        }
        return new gfss("\n").b(linkedHashSet0);
    }

    public static String b(heqa heqa0) {
        for(Object object0: heqa0.b) {
            hepz hepz0 = (hepz)object0;
            if(hepz0.c.isEmpty()) {
                return hepz0.d;
            }
        }
        return "";
    }
}

