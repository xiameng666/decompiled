final class ddzr implements ibtx {
    final ibtx a;

    public ddzr(ibtx ibtx0) {
        this.a = ibtx0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dib)object0), "$this$BaseScaffold");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dib)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dls.w(cvf.c(hey0, cvf.d(0, ((goz)object1), 0, 1)));
        ibtx ibtx0 = this.a;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
        int v1 = ddzq.a(gol.c(((goz)object1)));
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
        ibtx0.a(dim.a, ((goz)object1), Integer.valueOf(6));
        ((goz)object1).M(0x5D195900);
        ((goz)object1).A();
        dhw.d(iqn.a(hey0, "bottom"), ((goz)object1), 6);
        ((goz)object1).z();
        hfc hfc2 = dku.c(((dib)object0).a(hey0, hei.h), 0.0f, -fna.a, 1);
        iau iau1 = dhw.a(hei.a, false);
        int v2 = ddzq.a(gol.c(((goz)object1)));
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
        ((goz)object1).M(0x9E443C3D);
        ((goz)object1).A();
        ((goz)object1).z();
        return ibom.a;
    }
}

