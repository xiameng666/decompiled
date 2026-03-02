public final class qnv {
    public static final float a(qkb qkb0, qoj qoj0, float f) {
        int v = Float.compare(f, 0.0f);
        if(v < 0 && qkb0 == null) {
            return 1.0f;
        }
        if(qkb0 == null) {
            return 0.0f;
        }
        if(v < 0) {
            return qoj0 == null ? 1.0f : qoj0.a(qkb0);
        }
        return qoj0 == null ? 0.0f : qoj0.b(qkb0);
    }

    public static final Object b(qnu qnu0, ibrl ibrl0) {
        float f = qnv.a(qnu0.h(), qnu0.i(), qnu0.d());
        qnt qnt0 = new qnt(qnu0, qnu0.h(), f, f != qnu0.c(), null);
        Object object0 = cup.e(qnu0.f, qnt0, ibrl0);
        ibrx ibrx0 = ibrx.a;
        if(object0 != ibrx0) {
            object0 = ibom.a;
        }
        return object0 == ibrx0 ? object0 : ibom.a;
    }

    public static final qnu c(goz goz0) {
        goz0.M(0x78AB5FDA);
        goz0.M(0x6E3C21FE);
        Object object0 = goz0.j();
        if(object0 == gop.a) {
            object0 = new qnu();
            goz0.P(object0);
        }
        goz0.x();
        goz0.x();
        return (qnu)object0;
    }
}

