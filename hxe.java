final class hxe extends ibsl implements ibtw {
    int a;
    final long b;
    final hxg c;

    public hxe(long v, hxg hxg0, ibrl ibrl0) {
        this.b = v;
        this.c = hxg0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((hxe)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new hxe(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        switch(v) {
            case 0: {
                this.a = 1;
                if(iccv.c(this.b - 8L, this) != object1) {
                    goto label_7;
                }
                break;
            }
            case 1: {
            label_7:
                this.a = 2;
                if(iccv.c(8L, this) != object1) {
                label_9:
                    icbi icbi0 = this.c.a;
                    if(icbi0 != null) {
                        icbi0.w(ibnx.a(new hvw(this.b)));
                    }
                    return ibom.a;
                }
                break;
            }
            default: {
                goto label_9;
            }
        }
        return object1;
    }
}

