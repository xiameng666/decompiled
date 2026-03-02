final class ddeo implements ibtx {
    final hel a;
    final String b;

    public ddeo(hel hel0, String s) {
        this.a = hel0;
        this.b = s;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        hey hey0 = hfc.e;
        hfc hfc0 = dla.d(dml.b(dls.v(hey0), dmw.f(((goz)object1))), 8.0f);
        ((goz)object1).M(0x6E3C21FE);
        Object object3 = ((goz)object1).k();
        if(object3 == gop.a) {
            object3 = new ddem();
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        hfc hfc1 = hew.d(hfc0, new hwt(((ibts)object3)));
        hel hel0 = this.a;
        String s = this.b;
        iau iau0 = dhw.a(hei.a, false);
        long v = gol.c(((goz)object1));
        gzk gzk0 = ((goz)object1).ap();
        hfc hfc2 = hew.c(((goz)object1), hfc1);
        ibth ibth0 = iej.a;
        ((goz)object1).O();
        if(((goz)object1).ab()) {
            ((goz)object1).t(ibth0);
        }
        else {
            ((goz)object1).T();
        }
        int v1 = (int)(v ^ v >>> 0x20);
        guo.b(((goz)object1), iau0, iej.e);
        guo.b(((goz)object1), gzk0, iej.d);
        ibtw ibtw0 = iej.f;
        if(((goz)object1).ab() || !ibuq.m(((goz)object1).k(), Integer.valueOf(v1))) {
            Integer integer0 = v1;
            ((goz)object1).R(integer0);
            ((goz)object1).p(integer0, ibtw0);
        }
        guo.a(((goz)object1), iej.g);
        guo.b(((goz)object1), hfc2, iej.c);
        eaa eaa0 = fpu.c(((goz)object1)).c;
        long v2 = hll.h(hll.a, 0.4f);
        gaq.c(dls.p(dic.a.a(hey0, hel0), 0.0f, 400.0f), eaa0, v2, 0L, 0.0f, 0.0f, null, gzf.e(0x6BA30897, new dden(s), ((goz)object1)), ((goz)object1), 120);
        ((goz)object1).z();
        return ibom.a;
    }
}

