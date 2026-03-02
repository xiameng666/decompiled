final class iaf extends ibur implements ibtw {
    final hzw a;
    final ibtw b;

    public iaf(hzw hzw0, ibtw ibtw0) {
        this.a = hzw0;
        this.b = ibtw0;
        super(2);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if(((goz)object0).ad((v & 3) != 2, v & 1)) {
            ibtw ibtw0 = this.b;
            boolean z = this.a.b();
            ((goz)object0).aj(Boolean.valueOf(z));
            boolean z1 = ((goz)object0).Y(z);
            if(z) {
                ibtw0.a(((goz)object0), Integer.valueOf(0));
            }
            else {
                ((goz)object0).v(z1);
            }
            ((goz)object0).C();
            return ibom.a;
        }
        ((goz)object0).G();
        return ibom.a;
    }
}

