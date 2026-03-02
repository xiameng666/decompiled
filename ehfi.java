import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class ehfi {
    protected static final ggeo a;
    public final Map b;
    private final Map c;
    private final int d;

    static {
        ggek ggek0 = new ggek();
        ggek0.i(egft.a, Integer.valueOf(iaph.a.r));
        ggek0.i(egft.b, Integer.valueOf(iaph.b.r));
        ggek0.i(egft.c, Integer.valueOf(iaph.c.r));
        ggek0.i(egft.d, Integer.valueOf(iaph.d.r));
        ggek0.i(egft.e, Integer.valueOf(iaph.e.r));
        ggek0.i(egft.f, Integer.valueOf(iaph.f.r));
        ggek0.i(egft.g, Integer.valueOf(iaph.g.r));
        ggek0.i(egft.h, Integer.valueOf(iaph.h.r));
        ggek0.i(egft.i, Integer.valueOf(iaph.i.r));
        ggek0.i(egft.j, Integer.valueOf(iaph.j.r));
        ggek0.i(egft.k, Integer.valueOf(iaph.k.r));
        ggek0.i(egft.l, Integer.valueOf(iaph.l.r));
        ggek0.i(egft.m, Integer.valueOf(iaph.m.r));
        ggek0.i(egft.n, Integer.valueOf(iaph.n.r));
        ggek0.i(egft.o, Integer.valueOf(iaph.o.r));
        ggek0.i(egft.p, Integer.valueOf(iaph.p.r));
        ggek0.i(egft.q, Integer.valueOf(iaph.q.r));
        ehfi.a = ggek0.b();
    }

    public ehfi(int v) {
        egfw egfw0;
        this.b = new EnumMap(eggf.class);
        this.c = new EnumMap(eggf.class);
        this.d = v;
        try {
            byte[] arr_b = this.b();
            ProtoLiteMessage hftv0 = ProtoLiteMessage.y_parseFrom(((ProtoLiteMessage)egfw.a), arr_b, 0, arr_b.length, hftc.a);
            ProtoLiteMessage.P_makeImmutable(hftv0);
            egfw0 = (egfw)hftv0;
        }
        catch(hfur unused_ex) {
            egfw0 = egfw.a;
        }
        if((egfv.a(egfw0.c) == 0 ? 1 : egfv.a(egfw0.c)) == this.d) {
            ggeo ggeo0 = this.a();
            for(Object object0: egfw0.b) {
                eggg eggg0 = (eggg)object0;
                int v1 = eggg0.d;
                if(eggd.a(v1) == 3) {
                    ehfi.e(ggeo0, eggg0, this.b);
                }
                else {
                    if(eggd.a(v1) != 2) {
                        continue;
                    }
                    ehfi.e(ehfi.a, eggg0, this.c);
                }
            }
        }
    }

    protected abstract ggeo a();

    protected abstract byte[] b();

    public final int c(eggf eggf0, int v, String s) {
        return ehfi.d(eggf0, v, s, this.c);
    }

    public static final int d(eggf eggf0, int v, String s, Map map0) {
        if(map0.containsKey(eggf0)) {
            Map map1 = (Map)map0.get(eggf0);
            Integer integer0 = v;
            if(map1.containsKey(integer0)) {
                for(Object object0: ((List)map1.get(integer0))) {
                    eggg eggg0 = (eggg)object0;
                    if((eggg0.b & 16) != 0) {
                        eggb eggb0 = eggg0.g == null ? eggb.a : eggg0.g;
                        if((egga.a(eggb0.b) == 0 ? 1 : egga.a(eggb0.b)) - 1 == 0 || s != null && s.contains((eggg0.g == null ? eggb.a : eggg0.g).c)) {
                            goto label_13;
                        }
                        continue;
                    }
                label_13:
                    int v1 = egfy.a(eggg0.f);
                    return v1 == 0 ? 1 : v1;
                }
            }
        }
        return 1;
    }

    private static void e(Map map0, eggg eggg0, Map map1) {
        eggf eggf0 = eggf.b(eggg0.c) == null ? eggf.a : eggf.b(eggg0.c);
        if(!map1.containsKey(eggf0)) {
            map1.put(eggf0, new HashMap());
        }
        Map map2 = (Map)map1.get(eggf0);
        if(map0.containsKey((egft.b(eggg0.e) == null ? egft.a : egft.b(eggg0.e)))) {
            Integer integer0 = (Integer)map0.get((egft.b(eggg0.e) == null ? egft.a : egft.b(eggg0.e)));
            if(!map2.containsKey(integer0)) {
                map2.put(integer0, new ArrayList());
            }
            ((List)map2.get(integer0)).add(eggg0);
        }
    }
}

