final class dech implements ibtx {
    final String a;
    final ibts b;

    public dech(String s, ibts ibts0) {
        this.a = s;
        this.b = ibts0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        ddxv.b(((goz)object1));
        hfc hfc0 = dls.w(dla.i(hfc.e, 16.0f, 0.0f, 2));
        long v = fpu.a(((goz)object1)).B;
        eag eag0 = eah.a;
        hfc hfc1 = crd.c(hfc0, 2.0f, v, eag0);
        gcd gcd0 = fiud.a(fpu.a(((goz)object1)).J, fpu.a(((goz)object1)).J, hll.h, hll.h, ((goz)object1), 0x7FFFE7CF);
        ((goz)object1).M(-1633490746);
        int v1 = ((goz)object1).Z(((cmhw)object0));
        ibts ibts0 = this.b;
        int v2 = v1 | ((goz)object1).X(ibts0);
        Object object3 = ((goz)object1).k();
        if(v2 != 0 || object3 == gop.a) {
            object3 = new decg(((cmhw)object0), ibts0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fiuf.a(this.a, ((ibts)object3), hfc1, false, null, deaw.f, deaw.g, null, null, null, 0, 0, eag0, gcd0, ((goz)object1), 0x6C00000, 0x30000, 0);
        return ibom.a;
    }
}

