final class dxlg implements ibtx {
    final dxlm a;

    public dxlg(dxlm dxlm0) {
        this.a = dxlm0;
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
        dxlm dxlm0 = this.a;
        boolean z = ((goz)object1).Z(dxlm0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new dxlf(dxlm0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fisl.a(((ibth)object3), null, false, null, null, dxhy.c, ((goz)object1), 0x180000, 62);
        return ibom.a;
    }
}

