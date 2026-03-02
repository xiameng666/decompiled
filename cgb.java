final class cgb extends ibur implements ibty {
    final hfc a;
    final ibtx b;

    public cgb(hfc hfc0, ibtx ibtx0) {
        this.a = hfc0;
        this.b = ibtx0;
        super(4);
    }

    @Override  // ibty
    public final Object a(Object object0, Object object1, Object object2, Object object3) {
        int v = ((Number)object3).intValue();
        boolean z = true;
        int v1 = (v & 6) == 0 ? (((goz)object2).X(((cfz)object0)) ? 4 : 2) | v : v;
        if((v & 0x30) == 0) {
            v1 |= (((goz)object2).X(((hfc)object1)) ? 0x20 : 16);
        }
        if((v1 & 0x93) == 0x92) {
            z = false;
        }
        if(((goz)object2).ad(z, v1 & 1)) {
            hfc hfc0 = this.a.a(((hfc)object1));
            ibtx ibtx0 = this.b;
            iau iau0 = dhw.a(hei.a, false);
            long v2 = gol.c(((goz)object2));
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
            int v3 = (int)(v2 >>> 0x20 ^ v2);
            guo.b(((goz)object2), iau0, iej.e);
            guo.b(((goz)object2), gzk0, iej.d);
            ibtw ibtw0 = iej.f;
            if(((goz)object2).ab() || !ibuq.m(((goz)object2).k(), Integer.valueOf(v3))) {
                Integer integer0 = v3;
                ((goz)object2).R(integer0);
                ((goz)object2).p(integer0, ibtw0);
            }
            guo.a(((goz)object2), iej.g);
            guo.b(((goz)object2), hfc1, iej.c);
            ibtx0.a(((cfz)object0), ((goz)object2), Integer.valueOf(v1 & 14));
            ((goz)object2).z();
            return ibom.a;
        }
        ((goz)object2).G();
        return ibom.a;
    }
}

