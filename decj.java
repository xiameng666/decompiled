import java.util.List;

public final class decj implements ibty {
    final List a;
    final List b;

    public decj(List list0, List list1) {
        this.a = list0;
        this.b = list1;
        super();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        hfc hfc0;
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        int v2 = (v1 & 6) == 0 ? (((goz)object2).X(((dnj)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((goz)object2).V(v) ? 0x20 : 16);
        }
        if(((goz)object2).ad((v2 & 0x93) != 0x92, v2 & 1)) {
            deax deax0 = (deax)this.a.get(v);
            ((goz)object2).M(-2082067800);
            List list0 = this.b;
            if(list0.size() == 1) {
                ((goz)object2).M(-2082042350);
                ((goz)object2).A();
                eag eag0 = eah.b(20.0f);
                hfc0 = hhi.a(hfc.e, eag0);
            }
            else if(v == 0) {
                ((goz)object2).M(-2081960355);
                ((goz)object2).A();
                eag eag1 = eah.c(20.0f, 20.0f, 0.0f, 0.0f);
                hfc0 = hhi.a(hfc.e, eag1);
            }
            else {
                if(v == list0.size() - 1) {
                    ((goz)object2).M(-2081776618);
                    eag eag2 = eah.c(0.0f, 0.0f, 20.0f, 20.0f);
                    hfc hfc1 = hhi.a(hfc.e, eag2);
                    ddxv.b(((goz)object2));
                    hfc0 = dla.j(hfc1, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                }
                else {
                    ((goz)object2).M(0x83EED001);
                    ddxv.b(((goz)object2));
                    hfc0 = dla.j(hfc.e, 0.0f, 2.0f, 0.0f, 0.0f, 13);
                }
                ((goz)object2).A();
            }
            ddxv.b(((goz)object2));
            hfc hfc2 = dla.i(hfc.e, 16.0f, 0.0f, 2).a(hfc0);
            iau iau0 = dhw.a(hei.a, false);
            long v3 = gol.c(((goz)object2));
            gzk gzk0 = ((goz)object2).ap();
            hfc hfc3 = hew.c(((goz)object2), hfc2);
            ibth ibth0 = iej.a;
            ((goz)object2).O();
            if(((goz)object2).ab()) {
                ((goz)object2).t(ibth0);
            }
            else {
                ((goz)object2).T();
            }
            int v4 = (int)(v3 >>> 0x20 ^ v3);
            guo.b(((goz)object2), iau0, iej.e);
            guo.b(((goz)object2), gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(((goz)object2).ab() || !ibuq.m(((goz)object2).k(), Integer.valueOf(v4))) {
                Integer integer0 = v4;
                ((goz)object2).R(integer0);
                ((goz)object2).p(integer0, ibtw0);
            }
            guo.a(((goz)object2), iej.g);
            guo.b(((goz)object2), hfc3, iej.c);
            deck.b(deax0, ((goz)object2), 0);
            ((goz)object2).z();
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

