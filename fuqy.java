import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class fuqy {
    public static final fupv a(Map map0) {
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibpz.a(map0.size()));
        for(Object object0: map0.entrySet()) {
            linkedHashMap0.put(((Map.Entry)object0).getKey(), Integer.valueOf(hln.b(((hll)((Map.Entry)object0).getValue()).j)));
        }
        return new fupv(linkedHashMap0);
    }

    public static final qok b(fupt fupt0, goz goz0) {
        goz0.M(0xC06410D4);
        qok qok0 = qpj.d(new qou(fupt0.a()), goz0, 0);
        goz0.x();
        return qok0;
    }

    public static final qox c(fupt fupt0, fupv fupv0, goz goz0, int v) {
        qpb qpb0;
        goz0.M(-931904390);
        boolean z = (v & 2) == 0 ? false : csd.a(goz0);
        if((v & 4) != 0) {
            fupv0 = fuqy.d(fupt0, null, goz0, 2);
        }
        goz0.M(2088056058);
        Collection collection0 = fupt0.c();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: collection0) {
            hjmf hjmf0 = (hjmf)object0;
            goz0.M(-1015846792);
            List list0 = fupv0.b((!z || hjmf0.b().isEmpty() ? hjmf0.a() : hjmf0.b()));
            if(list0.isEmpty()) {
                goz0.x();
                qpb0 = null;
            }
            else {
                String[] arr_s = (String[])hjmf0.a.toArray(new String[0]);
                String s = hjmf0.b;
                if(ibuq.m(s, hjmg.a.i)) {
                    goz0.M(0xB43B5EE9);
                    Object object1 = ibpo.R(list0);
                    String[] arr_s1 = (String[])Arrays.copyOf(arr_s, arr_s.length);
                    qpb0 = qoz.b(qle.b, object1, arr_s1, goz0);
                    goz0.x();
                }
                else if(ibuq.m(s, hjmg.b.i)) {
                    goz0.M(0xB43B7722);
                    Object object2 = ibpo.R(list0);
                    String[] arr_s2 = (String[])Arrays.copyOf(arr_s, arr_s.length);
                    qpb0 = qoz.b(qle.a, object2, arr_s2, goz0);
                    goz0.x();
                }
                else if(ibuq.m(s, hjmg.c.i)) {
                    goz0.M(0xB43B8EBC);
                    qlo qlo0 = new qlo(((Number)ibpo.R(list0)).intValue());
                    String[] arr_s3 = (String[])Arrays.copyOf(arr_s, arr_s.length);
                    qpb0 = qoz.b(qle.K, qlo0, arr_s3, goz0);
                    goz0.x();
                }
                else if(!ibuq.m(s, hjmg.d.i) && !ibuq.m(s, hjmg.e.i)) {
                    goz0.M(0xD33CF5A5);
                    goz0.x();
                    qpb0 = null;
                }
                else {
                    goz0.M(0xD33A4C22);
                    Object[] arr_object = list0.toArray(new Integer[0]);
                    String[] arr_s4 = (String[])Arrays.copyOf(arr_s, arr_s.length);
                    qpb0 = qoz.b(qle.L, arr_object, arr_s4, goz0);
                    goz0.x();
                }
                goz0.x();
            }
            if(qpb0 != null) {
                arrayList0.add(qpb0);
            }
        }
        goz0.x();
        qpb[] arr_qpb = (qpb[])arrayList0.toArray(new qpb[0]);
        qox qox0 = qoz.a(((qpb[])Arrays.copyOf(arr_qpb, arr_qpb.length)), goz0);
        goz0.x();
        return qox0;
    }

    public static final fupv d(fupt fupt0, fen fen0, goz goz0, int v) {
        fupv fupv0;
        goz0.M(0xB4855C9B);
        if((v & 2) != 0) {
            fen0 = fpu.a(goz0);
        }
        goz0.M(-1633490746);
        int v1 = goz0.X(fupt0) | goz0.X(fen0);
        Object object0 = goz0.j();
        if(v1 != 0 || object0 == gop.a) {
            Set set0 = fupt0.d();
            ibuq.f(fen0, "colorScheme");
            ibuq.f(set0, "keys");
            if(set0.isEmpty()) {
                ibuq.f(fen0, "colorScheme");
                fupv0 = fuqy.a(fuqy.e(fen0)).a(fuqy.a(fuqy.f(fen0)));
            }
            else {
                Map map0 = fuqy.e(fen0);
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object1: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object1;
                    if(set0.contains(((String)map$Entry0.getKey()))) {
                        linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                    }
                }
                fupv fupv1 = fuqy.a(linkedHashMap0);
                Map map1 = fuqy.f(fen0);
                LinkedHashMap linkedHashMap1 = new LinkedHashMap();
                for(Object object2: map1.entrySet()) {
                    Map.Entry map$Entry1 = (Map.Entry)object2;
                    if(set0.contains(((String)map$Entry1.getKey()))) {
                        linkedHashMap1.put(map$Entry1.getKey(), map$Entry1.getValue());
                    }
                }
                fupv0 = fupv1.a(fuqy.a(linkedHashMap1));
            }
            object0 = fupv0;
            goz0.P(object0);
        }
        goz0.x();
        goz0.x();
        return (fupv)object0;
    }

    private static final Map e(fen fen0) {
        return ibpz.i(new ibns[]{new ibns("Background", new hll(fen0.n)), new ibns("On Background", new hll(fen0.o)), new ibns("Surface Variant", new hll(fen0.r)), new ibns("Inverse Surface", new hll(fen0.u)), new ibns("On Surface", new hll(fen0.q)), new ibns("On Surface Variant", new hll(fen0.s)), new ibns("Inverse On Surface", new hll(fen0.v)), new ibns("Primary", new hll(fen0.a)), new ibns("Inverse Primary", new hll(fen0.e)), new ibns("On Primary", new hll(fen0.b)), new ibns("Primary Container", new hll(fen0.c)), new ibns("On Primary Container", new hll(fen0.d)), new ibns("Secondary", new hll(fen0.f)), new ibns("On Secondary", new hll(fen0.g)), new ibns("Secondary Container", new hll(fen0.h)), new ibns("On Secondary Container", new hll(fen0.i)), new ibns("Tertiary", new hll(fen0.j)), new ibns("Tertiary Container", new hll(fen0.l)), new ibns("On Tertiary Container", new hll(fen0.m)), new ibns("Error", new hll(fen0.w)), new ibns("On Error", new hll(fen0.x)), new ibns("Outline", new hll(fen0.A))});
    }

    private static final Map f(fen fen0) {
        return ibpz.i(new ibns[]{new ibns("Surface 0", new hll(fen0.p)), new ibns("Surface 1", new hll(feq.b(fen0, 1.0f))), new ibns("Surface 2", new hll(feq.b(fen0, 2.0f))), new ibns("Surface 3", new hll(feq.b(fen0, 3.0f))), new ibns("Surface 4", new hll(feq.b(fen0, 4.0f))), new ibns("Surface 5", new hll(feq.b(fen0, 5.0f)))});
    }
}

