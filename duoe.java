final class duoe extends ibsl implements ibtw {
    long a;
    long b;
    int c;
    final duog d;

    public duoe(duog duog0, ibrl ibrl0) {
        this.d = duog0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((duoe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new duoe(this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        long v1;
        long v;
        long v3;
        long v2;
        Object object1 = ibrx.a;
        switch(this.c) {
            case 0: {
                ibnx.b(object0);
                v2 = ibzy.h(1, ibzz.d);
                v3 = ibzy.i(hwmp.a.l().e(), ibzz.d);
                goto label_26;
            }
            case 1: {
                v = this.b;
                v1 = this.a;
                ibnx.b(object0);
                break;
            }
            default: {
                v = this.b;
                v1 = this.a;
                ibnx.b(object0);
                goto label_20;
            }
        }
        while(true) {
            if(this.d.a().a != duoc.a) {
                return ibom.a;
            }
            ibzw.j(v1);
            this.a = v1;
            this.b = v;
            this.c = 2;
            if(iccv.d(v1, this) == object1) {
                break;
            }
        label_20:
            ibzw ibzw0 = new ibzw(ibzw.m(v1, 2));
            ibzw ibzw1 = new ibzw(v);
            if(ibzw0.compareTo(ibzw1) > 0) {
                ibzw0 = ibzw1;
            }
            v3 = v;
            v2 = ibzw0.c;
        label_26:
            this.a = v2;
            this.b = v3;
            this.c = 1;
            if(this.d.b(this) == object1) {
                break;
            }
            v1 = v2;
            v = v3;
        }
        return object1;
    }
}

