final class bvdh implements ibtx {
    final bvgx a;
    final eoqf b;

    public bvdh(bvgx bvgx0, eoqf eoqf0) {
        this.a = bvgx0;
        this.b = eoqf0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dim)object0), "$this$HeaderPage");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ((goz)object1).M(0x677F480B);
        if(htva.e()) {
            bvgb bvgb0 = this.a.c;
            if(bvgb0 != null) {
                float f = clua.a() ? 4.0f : 8.0f;
                hfc hfc0 = dla.j(hfc.e, f, 0.0f, 0.0f, 18.0f, 6);
                iau iau0 = dll.b(dho.a, hei.j, ((goz)object1), 0);
                long v1 = gol.c(((goz)object1));
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
                int v2 = (int)(v1 ^ v1 >>> 0x20);
                guo.b(((goz)object1), iau0, iej.e);
                guo.b(((goz)object1), gzk0, iej.d);
                ibtw ibtw0 = iej.f;
                if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
                    Integer integer0 = v2;
                    ((goz)object1).R(integer0);
                    ((goz)object1).p(integer0, ibtw0);
                }
                guo.a(((goz)object1), iej.g);
                guo.b(((goz)object1), hfc1, iej.c);
                bvdp.b(bvgb0, ((goz)object1), 8);
                ((goz)object1).z();
            }
        }
        ((goz)object1).A();
        bvgx bvgx0 = this.a;
        if(bvgx0.f) {
            ((goz)object1).M(-2005880997);
            bvfl.f(null, ((goz)object1), 0);
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(-2005827212);
        bvfl.a(this.b, bvgx0.b, ((goz)object1), 72);
        ((goz)object1).A();
        return ibom.a;
    }
}

