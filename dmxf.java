public final class dmxf implements ibtw {
    public final dmyx a;
    public final dld b;
    public final boolean c;
    public final dmyy d;
    public final hkhr e;
    public final dxev f;
    public final int g;

    public dmxf(dmyx dmyx0, dld dld0, boolean z, dmyy dmyy0, hkhr hkhr0, dxev dxev0, int v) {
        this.a = dmyx0;
        this.b = dld0;
        this.c = z;
        this.d = dmyy0;
        this.e = hkhr0;
        this.f = dxev0;
        this.g = v;
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        Integer integer0 = (Integer)object1;
        this.a.S(this.b, this.c, this.d, this.e, this.f, ((goz)object0), gsc.a(this.g | 1));
        return ibom.a;
    }
}

