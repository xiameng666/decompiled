final class ddxk implements ibtx {
    final ibtx a;
    final ibty b;
    final ibtx c;

    public ddxk(ibtx ibtx0, ibty ibty0, ibtx ibtx1) {
        this.a = ibtx0;
        this.b = ibty0;
        this.c = ibtx1;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        float f = ((dih)object0).d();
        hey hey0 = hfc.e;
        hfc hfc0 = dla.c(dls.w(hey0), new dle(16.0f, 10.0f, 16.0f, 10.0f));
        ibtx ibtx0 = this.a;
        ibty ibty0 = this.b;
        ibtx ibtx1 = this.c;
        hek hek0 = hei.k;
        iau iau0 = dll.b(dho.g, hek0, ((goz)object1), 54);
        int v1 = ddxj.a(gol.c(((goz)object1)));
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
        ibtw ibtw0 = iej.e;
        guo.b(((goz)object1), iau0, ibtw0);
        ibtw ibtw1 = iej.d;
        guo.b(((goz)object1), gzk0, ibtw1);
        ibtw ibtw2 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw2);
        }
        ibts ibts0 = iej.g;
        guo.a(((goz)object1), ibts0);
        ibtw ibtw3 = iej.c;
        guo.b(((goz)object1), hfc1, ibtw3);
        dlq dlq0 = dlq.a;
        hfc hfc2 = dlo.a(dlq0, hey0, 1.0f);
        iau iau1 = dll.b(dho.a, hek0, ((goz)object1), 54);
        int v2 = ddxj.a(gol.c(((goz)object1)));
        gzk gzk1 = ((goz)object1).ap();
        hfc hfc3 = hew.c(((goz)object1), hfc2);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau1, ibtw0);
        guo.b(((goz)object1), gzk1, ibtw1);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v2))) {
            Integer integer1 = v2;
            ((goz)object1).R(integer1);
            ((goz)object1).p(integer1, ibtw2);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc3, ibtw3);
        Integer integer2 = (int)6;
        ibtx0.a(dlq0, ((goz)object1), integer2);
        ((goz)object1).z();
        iau iau2 = dll.b(dho.b, hek0, ((goz)object1), 54);
        int v3 = ddxj.a(gol.c(((goz)object1)));
        gzk gzk2 = ((goz)object1).ap();
        hfc hfc4 = hew.c(((goz)object1), hey0);
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        guo.b(((goz)object1), iau2, ibtw0);
        guo.b(((goz)object1), gzk2, ibtw1);
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v3))) {
            Integer integer3 = v3;
            ((goz)object1).R(integer3);
            ((goz)object1).p(integer3, ibtw2);
        }
        guo.a(((goz)object1), ibts0);
        guo.b(((goz)object1), hfc4, ibtw3);
        ibty0.a(dlq0, new jkv(f), ((goz)object1), integer2);
        ibtx1.a(dlq0, ((goz)object1), integer2);
        ((goz)object1).z();
        ((goz)object1).z();
        return ibom.a;
    }
}

