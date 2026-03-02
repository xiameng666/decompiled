final class zyn implements ibtx {
    final zon a;
    final aacf b;

    public zyn(zon zon0, aacf aacf0) {
        this.a = zon0;
        this.b = aacf0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dkd)object0), "$this$FlowRow");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ggqk ggqk0 = this.a.a.E();
        ibuq.e(ggqk0, "iterator(...)");
        while(ggqk0.hasNext()) {
            zom zom0 = (zom)ggqk0.next();
            ((goz)object1).M(-1633490746);
            aacf aacf0 = this.b;
            int v1 = ((goz)object1).Z(aacf0) | ((goz)object1).Z(zom0);
            Object object3 = ((goz)object1).k();
            if(v1 != 0 || object3 == gop.a) {
                object3 = new zyl(aacf0, zom0);
                ((goz)object1).R(object3);
            }
            ((goz)object1).A();
            fiqv.c(((ibth)object3), dls.z(dla.d(hfc.e, 0.0f), 48.0f, 48.0f, 0.0f, 0.0f, 12), false, null, null, null, null, gzf.e(0xE65B5F11, new zym(zom0), ((goz)object1)), ((goz)object1), 0x30000030, 508);
        }
        return ibom.a;
    }
}

