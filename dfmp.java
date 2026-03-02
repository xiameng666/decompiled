final class dfmp implements ibtx {
    final ibth a;
    final boolean b;

    public dfmp(ibth ibth0, boolean z) {
        this.a = ibth0;
        this.b = z;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        ((Number)object2).intValue();
        ibuq.f(((cmhw)object0), "$this$VisualElement");
        ((goz)object1).M(5004770);
        ibth ibth0 = this.a;
        boolean z = ((goz)object1).X(ibth0);
        Object object3 = ((goz)object1).k();
        if(z || object3 == gop.a) {
            object3 = new dfmo(ibth0);
            ((goz)object1).R(object3);
        }
        ((goz)object1).A();
        fiqv.a(cmig.a(((cmhw)object0), ((ibth)object3)), null, this.b, null, null, null, null, null, dflj.b, ((goz)object1), 0x30000000, 506);
        return ibom.a;
    }
}

