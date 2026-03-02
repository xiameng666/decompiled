final class ddzj implements ibtx {
    final String a;

    public ddzj(String s) {
        this.a = s;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        boolean z = ((Boolean)object0).booleanValue();
        int v = ((Number)object2).intValue();
        if((v & 6) == 0) {
            v |= (((goz)object1).Y(z) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        if(z) {
            ((goz)object1).M(0xD92F9407);
            hfc hfc0 = dla.f(hfc.e, 8.0f, 16.0f, 12.0f, 16.0f);
            jbn jbn0 = fpu.d(((goz)object1)).r;
            gdh.b(this.a, hfc0, 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, jbn0, ((goz)object1), 0, 0x6180, 0x1AFFC);
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(-650879059);
        hfc hfc1 = dla.i(hfc.e, 12.0f, 0.0f, 2);
        jbn jbn1 = fpu.d(((goz)object1)).v;
        gdh.b(this.a, hfc1, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, jbn1, ((goz)object1), 0x30, 0x6180, 0x1AFFC);
        ((goz)object1).A();
        return ibom.a;
    }
}

