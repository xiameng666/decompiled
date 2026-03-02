import java.util.ArrayList;
import java.util.LinkedHashMap;

public final class ebry implements evpo {
    public final ebsf a;
    public final long b;

    public ebry(ebsf ebsf0, long v) {
        this.a = ebsf0;
        this.b = v;
    }

    @Override  // evpo
    public final Object a(evql evql0) {
        ebsf ebsf0 = this.a;
        if(evql0.n()) {
            hfuo hfuo0 = ((hkjs)evql0.j()).b;
            ibuq.e(hfuo0, "getCardInfoList(...)");
            LinkedHashMap linkedHashMap0 = new LinkedHashMap(ibwt.g(ibpz.a(ibpo.q(hfuo0, 10)), 16));
            for(Object object0: hfuo0) {
                hjwx hjwx0 = ((hkjm)object0).c;
                if(hjwx0 == null) {
                    hjwx0 = hjwx.a;
                }
                ibns ibns0 = new ibns(hjwx0.d, ((hkjm)object0));
                linkedHashMap0.put(ibns0.a, ibns0.b);
            }
            ebsf0.v = linkedHashMap0;
        }
        else {
            ebsf0.v = ibpt.a;
        }
        dyff dyff0 = ebsf0.b.b == 3 ? ((dyff)ebsf0.b.c) : dyff.a;
        ibuq.e(dyff0, "getDownloadMfiCardsRequest(...)");
        String s = dyff0.d;
        ibuq.e(s, "getDefaultTransitCardCid(...)");
        if(s.length() != 0) {
            dyfh dyfh0 = dyfg.a(((ProtoLiteMessage)dyff.a).v_newBuilder());
            String s1 = dyff0.d;
            ibuq.e(s1, "getDefaultTransitCardCid(...)");
            dyfh0.b(s1);
            dyfh0.f();
            hfuo hfuo1 = dyff0.c;
            ibuq.e(hfuo1, "getCardIdsList(...)");
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: hfuo1) {
                if(ibuq.m(((dyey)object1).c, dyff0.d)) {
                    arrayList0.add(object1);
                }
            }
            dyfh0.e(arrayList0);
            dyfh0.f();
            hfuo hfuo2 = dyff0.c;
            ibuq.e(hfuo2, "getCardIdsList(...)");
            ArrayList arrayList1 = new ArrayList();
            for(Object object2: hfuo2) {
                if(!ibuq.m(((dyey)object2).c, dyff0.d)) {
                    arrayList1.add(object2);
                }
            }
            dyfh0.e(arrayList1);
            dyff0 = dyfh0.a();
        }
        frli frli0 = ebsf0.b().a(ebsf0.a(), ebsf0.m());
        hfuo hfuo3 = dyff0.c;
        ibuq.e(hfuo3, "getCardIdsList(...)");
        ArrayList arrayList2 = new ArrayList(ibpo.q(hfuo3, 10));
        for(Object object3: hfuo3) {
            dyfn dyfn0 = dyfm.a(((ProtoLiteMessage)dyfk.a).v_newBuilder());
            String s2 = ((dyey)object3).c;
            ibuq.e(s2, "getCid(...)");
            dyfn0.b(s2);
            dyna dyna0 = dyna.b(((dyey)object3).b);
            if(dyna0 == null) {
                dyna0 = dyna.k;
            }
            ibuq.e(dyna0, "getSecureElementServiceProvider(...)");
            dyfn0.c(dyna0);
            arrayList2.add(dyfn0.a());
        }
        ((glyq)frli0.b(new ebrm(new ebrl(arrayList2)), ebsf0.l())).u();
        return ebsf0.i(dyff0.c.iterator()).d(ebsf0.k(), new ebsc(ebsf0, this.b));
    }
}

