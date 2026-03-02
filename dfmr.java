final class dfmr implements ibtx {
    final ibts a;
    final ibth b;
    final boolean c;

    public dfmr(ibts ibts0, ibth ibth0, boolean z) {
        this.a = ibts0;
        this.b = ibth0;
        this.c = z;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        ((goz)object1).M(-1633490746);
        ibts ibts0 = this.a;
        int v = ((goz)object1).X(ibts0);
        ibth ibth0 = this.b;
        int v1 = v | ((goz)object1).X(ibth0);
        Object object3 = ((goz)object1).k();
        if(v1 != 0 || object3 == gop.a) {
            object3 = new dfmq(ibts0, ibth0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fiqv.a(cmig.a(((cmhw)object0), ((ibth)object3)), null, this.c, null, null, null, null, null, dflj.c, ((goz)object1), 0x30000000, 506);
        return ibom.a;
    }
}

