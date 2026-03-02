import java.util.List;

final class duuf implements ibtx {
    final gtxf a;
    final List b;
    final ibts c;
    final ibth d;

    public duuf(gtxf gtxf0, List list0, ibts ibts0, ibth ibth0) {
        this.a = gtxf0;
        this.b = list0;
        this.c = ibts0;
        this.d = ibth0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPaddings");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hfc hfc0 = dla.i(dla.c(hfc.e, ((dld)object0)), 24.0f, 0.0f, 2);
        gtxf gtxf0 = this.a;
        List list0 = this.b;
        ibts ibts0 = this.c;
        ibth ibth0 = this.d;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
        long v1 = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc1 = hew.c(((goz)object1), hfc0);
        ibth ibth1 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth1);
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
        duus.b(gtxf0, list0, ibts0, ibth0, ((goz)object1), 0);
        ((goz)object1).z();
        return ibom.a;
    }
}

