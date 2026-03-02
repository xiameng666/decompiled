import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public final class bekt {
    private final Set a;
    private final Map b;
    private final Map c;
    private final Set d;

    public bekt(gged_interceptors gged0, gged_interceptors gged1) {
        beks beks0;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: gged0) {
            ibuq.e(((gqlt)object0).c, "getCredentialGroups(...)");
            ibpo.D(arrayList0, ((gqlt)object0).c);
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            ibpo.D(arrayList1, ((gqmd)object1).c());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator iterator2 = arrayList1.iterator();
        while(true) {
            bekw bekw0 = null;
            if(!iterator2.hasNext()) {
                break;
            }
            Object object2 = iterator2.next();
            bedg bedg0 = (bedg)object2;
            URI uRI0 = bekp.f(bedg0.c);
            if(uRI0 != null) {
                beko beko0 = bekp.c(uRI0);
                if(beko0 != null) {
                    bekw0 = new bekw(beko0, bedg0.a);
                }
            }
            if(bekw0 != null) {
                arrayList2.add(bekw0);
            }
        }
        this.a = ibpo.ay(arrayList2);
        if(gged1 == null) {
            this.b = ibpt.a;
            this.c = ibpt.a;
            this.d = ibpu.a;
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: gged1) {
            ibuq.c(((hhyh)object3));
            hfuo hfuo0 = ((hhyh)object3).c;
            ibuq.e(hfuo0, "getFacetList(...)");
            hhyf hhyf0 = (hhyf)ibpo.T(hfuo0);
            bekr bekr0 = hhyf0 == null ? null : new bekr(gqlo.c(hhyf0));
            ibns ibns0 = bekr0 == null ? null : new ibns(bekr0, ((hhyh)object3));
            if(ibns0 != null) {
                arrayList3.add(ibns0);
            }
        }
        Map map0 = ibpz.p(arrayList3);
        this.b = map0;
        Set set0 = map0.entrySet();
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: set0) {
            bekr bekr1 = (bekr)((Map.Entry)object4).getKey();
            hfuo hfuo1 = ((hhyh)((Map.Entry)object4).getValue()).c;
            ibuq.e(hfuo1, "getFacetList(...)");
            ArrayList arrayList5 = new ArrayList(ibpo.q(hfuo1, 10));
            for(Object object5: hfuo1) {
                arrayList5.add(new ibns(gqlo.c(((hhyf)object5)), bekr1));
            }
            ibpo.D(arrayList4, arrayList5);
        }
        Map map1 = ibpz.p(arrayList4);
        this.c = map1;
        ArrayList arrayList6 = new ArrayList();
        for(Object object6: gged0) {
            ibuq.e(((gqlt)object6).c, "getCredentialGroups(...)");
            ibpo.D(arrayList6, ((gqlt)object6).c);
        }
        ArrayList arrayList7 = new ArrayList();
        for(Object object7: arrayList6) {
            ibpo.D(arrayList7, ((gqmd)object7).c());
        }
        ArrayList arrayList8 = new ArrayList();
        for(Object object8: arrayList7) {
            bedg bedg1 = (bedg)object8;
            gqlo gqlo0 = (gqlo)gqlo.b(bedg1.c).g();
            if(gqlo0 != null) {
                bekr bekr2 = (bekr)map1.get(gqlo0);
                if(bekr2 != null) {
                    beks0 = new beks(bekr2, bedg1.a);
                    goto label_92;
                }
            }
            beks0 = null;
        label_92:
            if(beks0 != null) {
                arrayList8.add(beks0);
            }
        }
        this.d = ibpo.ay(arrayList8);
    }

    public final bekq a(beko beko0, String s) {
        bekq bekq0;
        URI uRI0 = beko0.a;
        gqlo gqlo0 = (gqlo)gqlo.b(uRI0.toString()).g();
        if(gqlo0 == null) {
            bekq0 = null;
        }
        else {
            bekr bekr0 = (bekr)this.c.get(gqlo0);
            if(bekr0 == null) {
                bekq0 = null;
            }
            else {
                hhyh hhyh0 = (hhyh)this.b.get(bekr0);
                if(hhyh0 == null) {
                    bekq0 = null;
                }
                else {
                    beks beks0 = new beks(bekr0, s);
                    if(this.d.contains(beks0)) {
                        String s1 = (hhyh0.d == null ? hhyo.a : hhyh0.d).c;
                        ibuq.e(s1, "getName(...)");
                        bekq0 = new bekq(s, s1);
                    }
                    else {
                        bekq0 = null;
                    }
                }
            }
        }
        if(bekq0 == null) {
            bekw bekw0 = new bekw(beko0, s);
            if(this.a.contains(bekw0)) {
                String s2 = uRI0.toString();
                ibuq.e(s2, "toString(...)");
                return new bekq(s, s2);
            }
            return null;
        }
        return bekq0;
    }
}

