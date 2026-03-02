import java.util.List;

public final class bdtn implements ibty {
    final List a;
    final bdtt b;
    final long c;

    public bdtn(List list0, bdtt bdtt0, long v) {
        this.a = list0;
        this.b = bdtt0;
        this.c = v;
        super();
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object1).intValue();
        int v1 = ((Number)object3).intValue();
        boolean z = true;
        int v2 = (v1 & 6) == 0 ? (((goz)object2).X(((dnj)object0)) ? 4 : 2) | v1 : v1;
        if((v1 & 0x30) == 0) {
            v2 |= (((goz)object2).V(v) ? 0x20 : 16);
        }
        if(((goz)object2).ad((v2 & 0x93) != 0x92, v2 & 1)) {
            bdtx bdtx0 = (bdtx)this.a.get(v);
            ((goz)object2).M(0xCC5D679D);
            int v3 = ibpo.d(this.b.c);
            if(v != v3) {
                z = false;
            }
            hey hey0 = hfc.e;
            hfc hfc0 = bdtv.a(hey0, z);
            iau iau0 = dhw.a(hei.a, false);
            long v4 = gol.c(((goz)object2));
            gzk gzk0 = ((goz)object2).ap();
            hfc hfc1 = hew.c(((goz)object2), hfc0);
            ibth ibth0 = iej.a;
            ((goz)object2).O();
            if(((goz)object2).ab()) {
                ((goz)object2).t(ibth0);
            }
            else {
                ((goz)object2).T();
            }
            int v5 = (int)(v4 ^ v4 >>> 0x20);
            guo.b(((goz)object2), iau0, iej.e);
            guo.b(((goz)object2), gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(((goz)object2).ab() || !ibuq.m(((goz)object2).k(), Integer.valueOf(v5))) {
                Integer integer0 = v5;
                ((goz)object2).R(integer0);
                ((goz)object2).p(integer0, ibtw0);
            }
            guo.a(((goz)object2), iej.g);
            guo.b(((goz)object2), hfc1, iej.c);
            bdqc.d(cqx.c(hey0, this.c), bdtx0, (v == v3 ? 16.0f : 0.0f), ((goz)object2), 0);
            ((goz)object2).z();
            ((goz)object2).A();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

