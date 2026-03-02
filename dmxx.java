final class dmxx implements ibtx {
    final dmyx a;
    final dld b;
    final boolean c;
    final hkhr d;
    final gui e;

    public dmxx(dmyx dmyx0, dld dld0, boolean z, hkhr hkhr0, gui gui0) {
        this.a = dmyx0;
        this.b = dld0;
        this.c = z;
        this.d = hkhr0;
        this.e = gui0;
        super();
    }

    @Override  // ibtx
    public final Object a(Object object0, Object object1, Object object2) {
        int v = ((Number)object2).intValue();
        ibuq.f(((dih)object0), "$this$BoxWithConstraints");
        if((v & 6) == 0) {
            v |= (((goz)object1).X(((dih)object0)) ? 4 : 2);
        }
        if((v & 19) == 18 && ((goz)object1).ac()) {
            ((goz)object1).G();
            return ibom.a;
        }
        if(hwpv.a.b().a() && jkv.a(((dih)object0).d(), 600.0f) >= 0) {
            ((goz)object1).M(0x73954279);
            dmyy dmyy0 = dmyx.C(this.e);
            this.a.U(this.b, this.c, dmyy0, this.d, this.a.av, ((goz)object1), 0);
            ((goz)object1).A();
            return ibom.a;
        }
        ((goz)object1).M(0x73983296);
        dmyy dmyy1 = dmyx.C(this.e);
        this.a.S(this.b, this.c, dmyy1, this.d, this.a.av, ((goz)object1), 0);
        ((goz)object1).A();
        return ibom.a;
    }
}

