import java.util.List;

final class fudb implements ibtw {
    final fuci a;
    final List b;

    public fudb(fuci fuci0, List list0) {
        this.a = fuci0;
        this.b = list0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        ibth ibth0 = ((fufv)((goz)object0).h(fugo.a)).a;
        hfc hfc0 = hhi.a(cqx.a(dls.w(hfc.e), fpu.a(((goz)object0)).F, fulh.a(fule.d, ((goz)object0))), fulh.a(fule.d, ((goz)object0)));
        ((goz)object0).M(-1633490746);
        int v = ((goz)object0).X(ibth0);
        fuci fuci0 = this.a;
        int v1 = v | ((goz)object0).Z(fuci0);
        Object object2 = ((goz)object0).k();
        if(v1 != 0 || object2 == gop.a) {
            object2 = new fucz(ibth0, fuci0);
            ((goz)object0).R(object2);
        }
        ((goz)object0).A();
        hfc hfc1 = cru.d(hfc0, false, null, null, null, ((ibth)object2), 15);
        ((goz)object0).M(5004770);
        List list0 = this.b;
        boolean z = ((goz)object0).Z(list0);
        Object object3 = ((goz)object0).k();
        if(z || object3 == gop.a) {
            object3 = new fuda(list0);
            ((goz)object0).R(object3);
        }
        ((goz)object0).A();
        hfc hfc2 = dla.e(iuc.d(hfc1, ((ibts)object3)), 20.0f, 20.0f);
        iau iau0 = dll.b(dho.e, hei.k, ((goz)object0), 54);
        long v2 = gol.c(((goz)object0));
        gzk gzk0 = ((goz)object0).ap();
        hfc hfc3 = hew.c(((goz)object0), hfc2);
        ibth ibth1 = iej.a;
        ((goz)object0).O();
        if(((goz)object0).ab()) {
            ((goz)object0).t(ibth1);
        }
        else {
            ((goz)object0).T();
        }
        int v3 = (int)(v2 ^ v2 >>> 0x20);
        guo.b(((goz)object0), iau0, iej.e);
        guo.b(((goz)object0), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object0).ab() || !ibuq.m(((goz)object0).k(), Integer.valueOf(v3))) {
            Integer integer0 = v3;
            ((goz)object0).R(integer0);
            ((goz)object0).p(integer0, ibtw0);
        }
        guo.a(((goz)object0), iej.g);
        guo.b(((goz)object0), hfc3, iej.c);
        jbn jbn0 = fpu.d(((goz)object0)).B;
        long v4 = fpu.a(((goz)object0)).a;
        ftzd.a(fuci0.d.a, null, v4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, jbn0, ((goz)object0), 0, 0, 0x1FFFA);
        ((goz)object0).z();
        return ibom.a;
    }
}

