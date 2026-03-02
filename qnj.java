final class qnj extends ibsl implements ibtw {
    int a;
    final boolean b;
    final boolean c;
    final qkb d;
    final int e;
    final boolean f;
    final float g;
    final qoj h;
    final qoe i;
    final gra j;
    final qnu k;

    public qnj(boolean z, boolean z1, qnu qnu0, qkb qkb0, int v, boolean z2, float f, qoj qoj0, qoe qoe0, gra gra0, ibrl ibrl0) {
        this.b = z;
        this.c = z1;
        this.k = qnu0;
        this.d = qkb0;
        this.e = v;
        this.f = z2;
        this.g = f;
        this.h = qoj0;
        this.i = qoe0;
        this.j = gra0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((qnj)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new qnj(this.b, this.c, this.k, this.d, this.e, this.f, this.g, this.h, this.i, this.j, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                if(this.b && !((Boolean)this.j.a()).booleanValue() && this.c) {
                    this.a = 1;
                    if(qnv.b(this.k, this) != object1) {
                        break;
                    }
                    return object1;
                }
                break;
            }
            case 1: {
                break;
            }
            default: {
                return ibom.a;
            }
        }
        this.j.b(Boolean.valueOf(this.b));
        if(this.b) {
            float f = this.k.c();
            this.a = 2;
            if(qnl.a(this.k, this.d, this.e, this.f, this.g, this.h, f, this.i, this, 0x202) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

