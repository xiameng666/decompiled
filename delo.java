final class delo implements ibtx {
    final gra a;

    public delo(gra gra0) {
        this.a = gra0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        long v = fpu.a(((goz)object1)).q;
        long v1 = fpu.a(((goz)object1)).F;
        ((goz)object1).M(-1697520581);
        fnb fnb0 = fnd.g(v1, v, hll.h(firh.g(fivi.a, ((goz)object1)), 0.1f), hll.h(firh.g(fivi.c, ((goz)object1)), 0.38f), ((goz)object1), 0);
        ((goz)object1).A();
        hfc hfc0 = dls.m(hfc.e, 28.0f, 40.0f);
        ((goz)object1).M(5004770);
        gra gra0 = this.a;
        boolean z = ((goz)object1).X(gra0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new delm(gra0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fisl.a(cmig.a(((cmhw)object0), ((ibth)object3)), hfc0, false, fnb0, null, gzf.e(0x6796E47F, new deln(gra0), ((goz)object1)), ((goz)object1), 0x180030, 52);
        return ibom.a;
    }
}

