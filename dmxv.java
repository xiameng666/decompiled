final class dmxv implements ibtx {
    final dmyx a;

    public dmxv(dmyx dmyx0) {
        this.a = dmyx0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dlp)object0), "$this$TopAppBar");
        if((v & 17) == 16 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        ((goz)object1).M(5004770);
        dmyx dmyx0 = this.a;
        boolean z = ((goz)object1).Z(dmyx0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new dmxu(dmyx0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fisl.a(((ibth)object3), null, false, null, null, dmzu.b, ((goz)object1), 0x180000, 62);
        return ibom.a;
    }
}

