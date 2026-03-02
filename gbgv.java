import java.util.List;

final class gbgv extends ibsl implements ibtw {
    final gbgy a;

    public gbgv(gbgy gbgy0, ibrl ibrl0) {
        this.a = gbgy0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((gbgv)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new gbgv(this.a, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        ibnx.b(object0);
        if(gaxn.a == null) {
            gaxn.a = new gatm();
        }
        gbgy gbgy0 = this.a;
        gatm gatm0 = gaxn.a;
        ibuq.e(gatm0, "getCachedMap(...)");
        gbhm gbhm0 = gbgy0.a;
        Object object1 = gatm0.a(gbhm0.a(), gbhm0.b());
        if(object1 == null) {
            gbgy0.b(gbhm0.c());
            gatm0.b(gbhm0.a(), gbgy0.a());
        }
        else {
            gbgy0.b(object1);
        }
        List list0 = ibpo.b(Integer.valueOf(gbhm0.a()));
        gbix.a(gbgy0.b, list0, gkwx.y);
        return ibom.a;
    }
}

