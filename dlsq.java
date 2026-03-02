final class dlsq implements ibtx {
    final gep a;
    final doz b;
    final dlte c;

    public dlsq(gep gep0, doz doz0, dlte dlte0) {
        this.a = gep0;
        this.b = doz0;
        this.c = dlte0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dld)object0), "contentPadding");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dld)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        hey hey0 = hfc.e;
        hfc hfc0 = dla.c(hey0, ((dld)object0));
        gep gep0 = this.a;
        doz doz0 = this.b;
        dlte dlte0 = this.c;
        iau iau0 = dii.a(dho.c, hei.m, ((goz)object1), 0);
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
        hfc hfc2 = huw.b(dla.i(dls.v(hey0), 24.0f, 0.0f, 2), ((fwe)gep0).c);
        ((goz)object1).M(5004770);
        boolean z = ((goz)object1).Z(dlte0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new dlso(dlte0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        dnh.a(hfc2, doz0, null, false, null, null, null, false, null, ((ibts)object3), ((goz)object1), 0, 508);
        ((goz)object1).z();
        return ibom.a;
    }
}

