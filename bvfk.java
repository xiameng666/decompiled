final class bvfk implements ibtx {
    final bvky a;
    final bvco b;
    final bvek c;

    public bvfk(bvky bvky0, bvco bvco0, bvek bvek0) {
        this.a = bvky0;
        this.b = bvco0;
        this.c = bvek0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object0).intValue();
        int v1 = ((Number)object2).intValue();
        if((v1 & 6) == 0) {
            v1 |= (((goz)object1).V(v) ? 4 : 2);
        }
        if((v1 & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dls.v(hfc.e);
        bvky bvky0 = this.a;
        bvco bvco0 = this.b;
        bvek bvek0 = this.c;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
        long v2 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v3 = (int)(v2 ^ v2 >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v3))) {
            Integer integer0 = v3;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc1, iej.c);
        buyj buyj0 = (buyj)bvky0.b.get(v);
        int v4 = buyj0.ordinal();
        switch(v4) {
            case 0: {
                ((goz)object1).M(0x4AEF5099);
                ((goz)object1).A();
                throw new IllegalStateException("Unexpected tab id: " + buyj0.name());
            }
            case 1: {
                ((goz)object1).M(0x4AEF3EF6);
                bvco0.a(bvky0.c, ((goz)object1), 0x30);
                ((goz)object1).A();
                break;
            }
            case 2: {
                ((goz)object1).M(0x4AEF492F);
                bvek0.a(bvky0.d, ((goz)object1), 0);
                ((goz)object1).A();
                break;
            }
            default: {
                if(v4 != 3) {
                    ((goz)object1).M(0x4AEF336D);
                    ((goz)object1).A();
                    throw new ibnq();
                }
                ((goz)object1).M(1257200537);
                ((goz)object1).A();
                throw new IllegalStateException("Unexpected tab id: " + buyj0.name());
            }
        }
        ((goz)object1).z();
        return ibom.a;
    }
}

