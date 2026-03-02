final class bgkm implements ibtw {
    final hfc a;

    public bgkm(hfc hfc0) {
        this.a = hfc0;
        super();
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        long v;
        if((((Number)object1).intValue() & 3) == 2 && ((goz)object0).ac()) {
            ((goz)object0).G();
            return ibom.a;
        }
        hfc hfc0 = dls.e(dls.d(this.a, 1.0f), 6.0f);
        if(hsam.f()) {
            ((goz)object0).M(0x9EAD0AF);
            v = fpu.a(((goz)object0)).H;
        }
        else {
            ((goz)object0).M(0x9EC1936);
            v = fpu.a(((goz)object0)).v;
        }
        ((goz)object0).A();
        dlv.a(cqx.c(hfc0, v), ((goz)object0));
        return ibom.a;
    }
}

